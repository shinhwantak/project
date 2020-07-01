package com.spring.mapper;

import java.util.List;

import com.spring.domain.CodeLabelValue;

public interface CodeMapper {

	public List<CodeLabelValue> getCodeClassList(String classCode) throws Exception;

}
