package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.CodeDetail;
import com.spring.mapper.CodeDetailMapper;

@Service
public class CodeDetailServiceImpl implements CodeDetailService {
	
	@Autowired
	private CodeDetailMapper mapper;

	@Override
	public void register(CodeDetail codeDetail) throws Exception {

		String classCode = codeDetail.getClassCode();
		
		int maxSortSeq = mapper.getMaxSortSeq("A01");
		
		codeDetail.setSortSeq(maxSortSeq + 1);
		
		System.out.println("코드 디테일 " + codeDetail);
		
		mapper.create(codeDetail);
	}

	@Override
	public List<CodeDetail> list() throws Exception {
		return mapper.list();
	}
	
	

}
