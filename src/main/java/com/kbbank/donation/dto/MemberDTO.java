package com.kbbank.donation.dto;

import java.util.Date;

public class MemberDTO {
	
	private String userid;
	private String passwd;
	private String mailAddress;
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

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "MemberDTO{" +
				"userid='" + userid + '\'' +
				", passwd='" + passwd + '\'' +
				", mailAddress='" + mailAddress + '\'' +
				", regDate=" + regDate +
				'}';
	}
}
