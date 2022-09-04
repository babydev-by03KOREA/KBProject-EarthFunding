package com.kbbank.donation;

import com.kbbank.donation.SNSService.*;
import com.kbbank.donation.dto.KakaoDTO;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import java.util.HashMap;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Kakao/*")
public class KakaoController {

    @Autowired
    private KakaoService kakaoService;

//    private static final Logger logger = LoggerFactory.getLogger(KakaoController.class);

    @RequestMapping("UserLogin.do")
    public String KakaoLogin(@RequestParam(value = "code", required = false) String code, HttpSession session) throws Exception {

//    	접속토큰 가져오기 및 저장
        System.out.println("####USER#### " + code);
        String access_Token = kakaoService.getAccessToken(code);

//      접속자 정보 가져오기
//        HashMap<String, Object> userInfo = kakaoService.getUserInfo(access_Token);
//        System.out.println("###access_Token#### : " + access_Token);
//        System.out.println("###nickname#### : " + userInfo.get("nickname"));
//        System.out.println("###email#### : " + userInfo.get("email"));
//        logger.info(access_Token);

//      KakaoDTO에서 정보 가져오기
        KakaoDTO userInfo = kakaoService.getUserInfo(access_Token);

        System.out.println("###access_Token#### : " + access_Token);
        System.out.println("###nickname#### : " + userInfo.getK_name());
        System.out.println("###email#### : " + userInfo.getK_email());

        session.setAttribute("KName", userInfo.getK_name());
        session.setAttribute("kEamil", userInfo.getK_email());

        return "member/SNS/KakaoInfo";
    }

}
