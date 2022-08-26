package com.kbbank.donation.SNSService;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kbbank.donation.dao.MemberDAO;
import com.kbbank.donation.dto.KakaoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

@Service
public class KakaoService {

	@Autowired
	private MemberDAO md;
	
    @SuppressWarnings("deprecation")
	public String getAccessToken(String authorize_code) {
        String access_Token = "";
        String refresh_Token = "";
        String reqURL = "https://kauth.kakao.com/oauth/token";

        try{
            URL url = new URL(reqURL);
//          절대 경로로 url 객체 생성
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//          POST 요청을 위해 기본값을 true로 변경
            con.setRequestMethod("POST");
            con.setDoOutput(true);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(con.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");

            sb.append("&client_id=b516cfd19e1309e1920f8910eedeabc2"); //본인이 발급받은 key
            sb.append("&redirect_uri=http://localhost:8080/Kakao/UserLogin.do"); // 본인이 설정한 주소

            sb.append("&code=" + authorize_code);
            bw.write(sb.toString());
            bw.flush();

            // 결과 코드가 200이라면 성공
            int responseCode = con.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            // 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            
            System.out.println("response body : " + result);

            // Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            access_Token = element.getAsJsonObject().get("access_token").getAsString();
            refresh_Token = element.getAsJsonObject().get("refresh_token").getAsString();

            System.out.println("access_token : " + access_Token);
            System.out.println("refresh_token : " + refresh_Token);

            br.close();
            bw.close();

        }catch(IOException e) {
            e.printStackTrace();
        }

        return access_Token;
    }

    @SuppressWarnings("deprecation")
	public KakaoDTO getUserInfo(String access_Token) {

        // 요청하는 클라이언트마다 가진 정보가 다를 수 있기에 HashMap타입으로 선언
        HashMap<String, Object> userInfo = new HashMap<String, Object>();
        String reqURL = "https://kapi.kakao.com/v2/user/me";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // 요청에 필요한 Header에 포함될 내용
            conn.setRequestProperty("Authorization", "Bearer " + access_Token);

            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            
            System.out.println("response body : " + result);

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
            JsonObject kakao_account = element.getAsJsonObject().get("kakao_account").getAsJsonObject();

            String nickname = properties.getAsJsonObject().get("nickname").getAsString();
            String email = kakao_account.getAsJsonObject().get("email").getAsString();

            userInfo.put("nickname", nickname);
            userInfo.put("email", email);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        KakaoDTO result = md.findKakao(userInfo);
        System.out.println("S: " + result);
        
        if(result == null) {
//        	null이면 가입이 되어있지 않으므로 회원가입 로직으로 →
        	md.Kakaoinsert(userInfo);
//        	Repository로 전송! / null값 전송을 방지하기 위한 if Logic
        	return md.findKakao(userInfo);
        } else {
        	return result;
        }
        
    }
}
