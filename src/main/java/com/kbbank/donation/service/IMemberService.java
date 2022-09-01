package com.kbbank.donation.service;

import javax.servlet.http.HttpSession;

import com.kbbank.donation.dto.*;

public interface IMemberService {
	public MemberDTO memberLogin(MemberDTO dto) throws Exception;
//	public MemberDTO memberNickName(MemberDTO dto) throws Exception;
	public void logOut(HttpSession session);
	public void memberJoin(MemberDTO dto) throws Exception;
}
