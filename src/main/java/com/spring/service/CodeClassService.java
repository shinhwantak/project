package com.spring.service;

import java.util.List;

import com.spring.domain.CodeClass;

public interface CodeClassService {

	public void register(CodeClass codeClass) throws Exception;

	public List<CodeClass> list() throws Exception;

	 public CodeClass read(String classCode) throws Exception;

	public void modify(CodeClass codeClass) throws Exception;

	public void remove(String classCode)throws Exception;

	
	
}
