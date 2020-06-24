package com.spring.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CodeClass implements Serializable {

	//자바 직렬화
	private static final long serialVersionUID = 6621378083749101963L;    
	
	private String class_code;
	private String class_name;
	private String use_yn;
	private Date reg_date;
	private Date upd_date;

	
	
	
}
