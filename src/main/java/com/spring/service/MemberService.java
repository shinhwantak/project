package com.spring.service;

import java.util.List;

import com.spring.domain.Member;

public interface MemberService {

	public void register(Member member)throws Exception;

	public List<Member> list() throws Exception;

	
}
