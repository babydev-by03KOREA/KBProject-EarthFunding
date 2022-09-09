package com.kbbank.donation.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.kbbank.donation.dao.MemberDAO;
import com.kbbank.donation.dto.MemberDTO;

@Service
public class MemberService implements IMemberService{
	
	@Inject
	MemberDAO memberDao;

	@Override
	public int memberLogin(MemberDTO dto) throws Exception {
		
		int name = memberDao.memberLogin(dto);
		
		return name;
	}
	
	@Override
	public String memberNickName(MemberDTO dto) throws Exception {
		
		String LoginUser = memberDao.memberNickName(dto);
		
		return LoginUser;
	}
	
	@Override
	public void memberJoin(MemberDTO dto) throws Exception {
		memberDao.memberJoin(dto);
	}

	@Override
	public void logOut(HttpSession session) {
		session.invalidate();  // Session 초기화 | 탈퇴 및 Logout에 사용됨.
	}

}
