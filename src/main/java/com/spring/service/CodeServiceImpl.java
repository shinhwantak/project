package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.CodeLabelValue;
import com.spring.mapper.CodeMapper;

@Service
public class CodeServiceImpl implements CodeService{

	@Autowired
	private CodeMapper mapper;

	@Override
	public List<CodeLabelValue> getCodeClassList(String classCode) throws Exception {
		return mapper.getCodeClassList(classCode);
	}
	
}
