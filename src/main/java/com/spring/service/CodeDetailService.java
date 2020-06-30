package com.spring.service;

import java.util.List;

import com.spring.domain.CodeDetail;

public interface CodeDetailService {

 public void register(CodeDetail codeDetail) throws Exception;

 public List<CodeDetail> list()throws Exception;

}
