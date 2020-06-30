package com.spring.mapper;

import java.util.List;

import com.spring.domain.CodeDetail;

public interface CodeDetailMapper {

	public void create(CodeDetail codeDetail) throws Exception;

	public int getMaxSortSeq(String classCode)throws Exception;

	public List<CodeDetail> list()throws Exception;
	
	
}
