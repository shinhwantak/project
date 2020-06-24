package com.spring.domain;

import java.io.Serializable;
import java.util.Date;




public class CodeClass implements Serializable {

	//자바 직렬화
	private static final long serialVersionUID = 6621378083749101963L;    
	
	private String class_code;
	private String class_name;
	private String use_yn;
	private Date reg_date;
	private Date upd_date;
	public String getClass_code() {
		return class_code;
	}
	public void setClass_code(String class_code) {
		this.class_code = class_code;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getUpd_date() {
		return upd_date;
	}
	public void setUpd_date(Date upd_date) {
		this.upd_date = upd_date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
