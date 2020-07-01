package com.spring.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

public class Member implements Serializable {

	
	private static final long serialVersionUID = 5965448709809155461L;
	
	//유저번호
	private int userNo;
	
	
	//아이디
	@NotBlank
	private String userid;
	
	//비민번호
	@NotBlank
	private String userPw;
	
	//이름
	@NotBlank
	private String userName;
	
	//직업
	private String job;
	//코인
	private int coin;
	
	private boolean enabled;
	
	private Date regDate;
	
	private Date updDate;
	
	private List<MemberAuth> authList;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public List<MemberAuth> getAuthList() {
		return authList;
	}

	public void setAuthList(List<MemberAuth> authList) {
		this.authList = authList;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userid=" + userid + ", userPw=" + userPw + ", userName=" + userName
				+ ", job=" + job + ", coin=" + coin + ", enabled=" + enabled + ", regDate=" + regDate + ", updDate="
				+ updDate + ", authList=" + authList + "]";
	}
	
	
	
}
