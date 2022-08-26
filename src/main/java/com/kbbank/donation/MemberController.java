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
    public String memberLogin(@RequestParam("userid") String id
                       , @RequestParam("passwd") String password , HttpSession session) throws Exception {

        String path = "";

        MemberDTO dto = new MemberDTO();
        
//        session.setAttribute("LoginUser", service.memberNickName(dto));
//        System.out.println(service.memberNickName(dto));
        session.setAttribute("LoginUser", id);
        
        dto.setUserid(id);
        dto.setPasswd(password);

        int result = service.memberLogin(dto);

        if(result == 1) {
            path = "member/success";
        } else {
            path = "member/loginError";
        }

        return path;

    }
	
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
		service.logOut(session);
		mav.setViewName("member/success");
		mav.addObject("message", "logout");
		return mav;
	}

	//	회원가입 처리 → 이동시에는 Get Method 타고가기
	@RequestMapping(value = "UserJoin.do", method = RequestMethod.GET)
	public String getJoin() throws Exception {
		return "member/UserJoin";
	}
	
//	회원가입 처리 → Data 처리시에는 Post Method 타고가기
	@RequestMapping(value = "UserJoin.do", method = RequestMethod.POST)
	public String postJoin(MemberDTO dto) throws Exception {
		service.memberJoin(dto);
		return "member/JoinSuccess";
	}
		
}
