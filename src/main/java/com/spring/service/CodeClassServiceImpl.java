package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mapper.CodeClassMapper;

@Service
public class CodeClassServiceImpl implements CodeClassService {

	
	@Autowired
	private CodeClassMapper mapper;
		
	
}
