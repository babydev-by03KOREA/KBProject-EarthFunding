package com.kbbank.donation;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.kbbank.donation.dto.MemberDTO;
import com.kbbank.donation.service.MemberService;

import java.util.Random;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @ModelAttribute("cp")
    public String getContextPath(HttpServletRequest request) {
//		정적파일 위치를 ${cp}로 맵핑해줌.
        return request.getContextPath();
    }

    @Inject
    private MemberService service;

    @Inject
    private BCryptPasswordEncoder bc;

    @Autowired
    private JavaMailSender mail;

    //	회원가입 처리 → 이동시에는 Get Method 타고가기
    @RequestMapping(value = "UserJoin.do", method = RequestMethod.GET)
    public String getJoin() throws Exception {
        return "member/UserJoin";
    }

    //	회원가입 처리 → Data 처리시에는 Post Method 타고가기
    @RequestMapping(value = "UserJoin.do", method = RequestMethod.POST)
    public String postJoin(MemberDTO dto) throws Exception {
        int idOverLap = this.service.idChk(dto);

        try {
            if (idOverLap == 1) {
                return "member/UserJoin";
            } else {
                if (idOverLap == 0) {
                    String inputPWD = dto.getPasswd();
                    String PWD = bc.encode(inputPWD);
                    dto.setPasswd(PWD);

                    this.service.memberJoin(dto);
                }

                return "member/JoinSuccess";
            }
        } catch (Exception var4) {
            throw new RuntimeException();
        }
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String LoginPage() {
        return "member/login";
    }

    // 로그인 post
    @RequestMapping(value = "/login_check.do", method = RequestMethod.POST)
    public String login(MemberDTO dto, Model model) throws Exception{

        MemberDTO login = service.memberLogin(dto);

        if(login != null && bc.matches(dto.getPasswd(), login.getPasswd())) {
            // model은 request영역이다. 그것을 상단의 @SessionAttributes가 session영역으로 바꿔준다.
            // request → session
            model.addAttribute("loginUser", login.getNickName());
            return "member/success";
        } else {
            return "member/loginError";
        }
    }

    @ResponseBody
    @RequestMapping(
            value = {"idCheck.do"},
            method = {RequestMethod.POST}
    )
    public int idOverLap(MemberDTO dto) throws Exception {
        int idOverLap = this.service.idChk(dto);
        return idOverLap;
    }

    /* 이메일 인증 */
    @RequestMapping(value="/emailCheck.do", method=RequestMethod.GET)
    @ResponseBody
    public String mailCheckGET(String email) throws Exception{

        /* 뷰(View)로부터 넘어온 데이터 확인 */
        logger.info("이메일 데이터 전송 확인");
        logger.info("인증번호 : " + email);

        /* 난수 생성 */
        Random random = new Random();
        int checkNum = random.nextInt(888888) + 111111;
        logger.info("인증번호 " + checkNum);

        /* 이메일 보내기 */
        String setFrom = "sjinjin6@naver.com";
        String toMail = email;
        String title = "회원가입 인증 이메일 입니다.";
        String content =
                "더 나은 세상을 위해 동참해주셔서 감사합니다." +
                        "<br><br>" +
                        "인증 번호는 " + "<h2><strong>" + checkNum + "</h2></strong>" + " 입니다." +
                        "<br>" +
                        "해당 인증번호를 인증번호 확인란에 기입하여 주세요.";

        try {

            MimeMessage message = mail.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
            helper.setFrom(setFrom);
            helper.setTo(toMail);
            helper.setSubject(title);
            helper.setText(content,true);
            mail.send(message);

        }catch(Exception e) {
            e.printStackTrace();
        }

        String num = Integer.toString(checkNum);

        return num;

    }

    @RequestMapping("logout.do")
    public ModelAndView logout(HttpSession session, ModelAndView mav) {
        service.logOut(session);
        mav.setViewName("member/success");
        mav.addObject("message", "logout");
        return mav;
    }

}
