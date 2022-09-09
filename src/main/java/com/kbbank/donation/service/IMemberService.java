package com.kbbank.donation.service;

import javax.servlet.http.HttpSession;

import com.kbbank.donation.dto.*;

public interface IMemberService {
	public int memberLogin(MemberDTO dto) throws Exception;
	public String memberNickName(MemberDTO dto) throws Exception;
	int idChk(MemberDTO var1) throws Exception;
	public void logOut(HttpSession session);
	public void memberJoin(MemberDTO dto) throws Exception;
}
