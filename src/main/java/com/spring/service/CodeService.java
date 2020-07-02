package com.spring.service;

import java.util.List;

import com.spring.domain.CodeLabelValue;

public interface CodeService {

	public List<CodeLabelValue> getCodeClassList(String classCode) throws Exception;
	
	public List<CodeLabelValue> getCodeList(String classCode) throws Exception;
	
	
}
