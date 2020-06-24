package com.spring.mapper;

import java.util.List;

import com.spring.domain.CodeClass;

public interface CodeClassMapper {

	public void create(CodeClass codeClass)throws Exception;

	public List<CodeClass> list()throws Exception;

	public CodeClass read(String classCode)throws Exception;

}
