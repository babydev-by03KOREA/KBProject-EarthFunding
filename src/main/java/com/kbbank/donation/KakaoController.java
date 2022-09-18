package com.kbbank.donation;

import com.kbbank.donation.SNSService.*;
import com.kbbank.donation.dto.KakaoDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Kakao/*")
public class KakaoController {

    @Autowired
    private KakaoService kakaoService;
    
    private static final Logger logger = LoggerFactory.getLogger(KakaoController.class);

    @RequestMapping("UserLogin.do")
    public String KakaoLogin(@RequestParam (value = "code", required = false) String code, HttpServletRequest request, HttpSession session) throws Exception {
    	
//    	접속토큰 가져오기 및 저장
        logger.info("####USER#### " + code);
        String access_Token = kakaoService.getAccessToken(code);
        
//      접속자 정보 가져오기
//        HashMap<String, Object> userInfo = kakaoService.getUserInfo(access_Token);
//        System.out.println("###access_Token#### : " + access_Token);
//        System.out.println("###nickname#### : " + userInfo.get("nickname"));
//        System.out.println("###email#### : " + userInfo.get("email"));
//        logger.info(access_Token);
        
//      KakaoDTO에서 정보 가져오기
        KakaoDTO userInfo = kakaoService.getUserInfo(access_Token);

        logger.info("###access_Token#### : " + access_Token);
        logger.info("###nickname#### : " + userInfo.getK_name());
        logger.info("###email#### : " + userInfo.getK_email());

//        KakaoDTO kdto = kakaoService.getUserInfo(userInfo.getK_name());
//        logger.info("##SessionScope## : " + kdto);
        session.setAttribute("Kmember", userInfo.getK_name());
        
        return "redirect:/index.do";
    }

}
