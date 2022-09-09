package com.kbbank.donation.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kbbank.donation.dto.KakaoDTO;
import com.kbbank.donation.dto.MemberDTO;

@Repository
public class MemberDAO implements IMemberDAO{

	@Autowired
	private SqlSessionTemplate session;

	@Override
	public int memberLogin(MemberDTO dto) throws Exception {
		return session.selectOne("Member.memberLogin", dto);
	}
	
	@Override
	public String memberNickName(MemberDTO dto) throws Exception {
		return session.selectOne("Member.memberNickName", dto);
	}

	public int idChk(MemberDTO dto) throws Exception {
		int idChkResult = (Integer)this.session.selectOne("Member.idChk", dto);
		return idChkResult;
	}
	
	@Override
	public void Kakaoinsert(HashMap<String, Object> userInfo) {
		session.insert("Member.Kakaoinsert", userInfo);
	}

	@Override
	public KakaoDTO findKakao(HashMap<String, Object> userInfo) {
		System.out.println("KakaoName: " + userInfo.get("nickname"));
		System.out.println("KakaoEmail: " + userInfo.get("email"));
		return session.selectOne("Member.findKakao", userInfo);
	}
	
//	회원가입 처리
	
	@Override
	public void memberJoin(MemberDTO dto) throws Exception {
		session.insert("Member.register", dto);
	}

}
