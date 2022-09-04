package com.kbbank.donation;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.kbbank.donation.dto.MemberDTO;
import com.kbbank.donation.service.MemberService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    BCryptPasswordEncoder pwEncoder;

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String LoginPage() {
        return "member/login";
    }

    @RequestMapping(value = "/login_check.do", method = RequestMethod.POST)
    public String login(MemberDTO dto, HttpServletRequest req, RedirectAttributes rttr) throws Exception {

        HttpSession session = req.getSession();
        MemberDTO login = service.memberLogin(dto);
//		MemberDTO userNickName = service.memberNickName(dto);

        if (login == null) {
            session.setAttribute("member", null);
            rttr.addFlashAttribute("msg", false);
            return "member/loginError";
        } else {
//			로그인 성공 시
            session.setAttribute("nickName", login.getNickName());
            System.out.println(login.getNickName());
        }

        return "member/success";

    }

    @RequestMapping("logout.do")
    public ModelAndView logout(HttpSession session, ModelAndView mav) {
        service.logOut(session);
        mav.setViewName("member/success");
        mav.addObject("message", "logout");
        return mav;
    }

    //	회원가입 처리 → 이동시에는 Get Method 타고가기

    //	ID OverLap Check
    @ResponseBody
    @RequestMapping(value = "idCheck.do", method = RequestMethod.POST)
    public int idOverLap(MemberDTO dto) throws Exception {
        int idOverLap = service.idChk(dto);
        return idOverLap;
    }

    @RequestMapping(value = "UserJoin.do", method = RequestMethod.GET)
    public String getJoin() throws Exception {
        return "member/UserJoin";
    }

    //	회원가입 처리 → Data 처리시에는 Post Method 타고가기
    @RequestMapping(value = "UserJoin.do", method = RequestMethod.POST)
    public String postJoin(MemberDTO dto) throws Exception {
        int idOverLap = service.idChk(dto);
        try {
            if (idOverLap == 1) {
                return "member/UserJoin";
            } else if (idOverLap == 0) {
                service.memberJoin(dto);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return "member/JoinSuccess";
    }

}
