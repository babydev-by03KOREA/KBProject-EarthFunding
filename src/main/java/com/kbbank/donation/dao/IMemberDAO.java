package com.kbbank.donation.dao;

import java.util.HashMap;

import com.kbbank.donation.dto.KakaoDTO;
import com.kbbank.donation.dto.MemberDTO;

public interface IMemberDAO {
	public MemberDTO memberLogin(MemberDTO dto) throws Exception;
	int idChk(MemberDTO var1) throws Exception;
	public String memberNickName(MemberDTO dto) throws Exception;
	public void Kakaoinsert(HashMap<String, Object> userInfo);
	public KakaoDTO findKakao(HashMap<String, Object> userInfo);
	public void memberJoin(MemberDTO dto) throws Exception;
}
