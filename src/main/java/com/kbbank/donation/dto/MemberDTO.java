package com.kbbank.donation.dto;

import java.util.Date;

public class MemberDTO {
	
	private String userid;
	private String passwd;
	private String nickName;
	private Date regDate;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", nickName=" + nickName + ", regDate=" + regDate
				+ "]";
	}

}
