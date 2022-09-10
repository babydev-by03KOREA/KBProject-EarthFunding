package com.kbbank.donation;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.kbbank.donation.dto.MemberDTO;
import com.kbbank.donation.service.MemberService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.PrintWriter;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

    @ModelAttribute("cp")
    public String getContextPath(HttpServletRequest request) {
//		정적파일 위치를 ${cp}로 맵핑해줌.
        return request.getContextPath();
    }

    @Inject
    MemberService service;

    @Inject
    BCryptPasswordEncoder bc;

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

    @RequestMapping("logout.do")
    public ModelAndView logout(HttpSession session, ModelAndView mav) {
        service.logOut(session);
        mav.setViewName("member/success");
        mav.addObject("message", "logout");
        return mav;
    }

}
