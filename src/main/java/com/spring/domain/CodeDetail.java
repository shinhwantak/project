package com.spring.domain;

import java.io.Serializable;
import java.util.Date;

public class CodeDetail implements Serializable {

	private static final long serialVersionUID = 8554420708128455643L;

	private String classCode;
	private String codeValue;
	private String codeName;
	private int sortSeq;
    private String 	useYn;
	private Date regDate;
	private Date updDate;
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public int getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(int sortSeq) {
		this.sortSeq = sortSeq;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
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
	@Override
	public String toString() {
		return "CodeDetail [classCode=" + classCode + ", codeValue=" + codeValue + ", codeName=" + codeName
				+ ", sortSeq=" + sortSeq + ", useYn=" + useYn + ", regDate=" + regDate + ", updDate=" + updDate + "]";
	}


	
	
	
	
	
	
}
