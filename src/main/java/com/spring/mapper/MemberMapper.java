package com.spring.mapper;

import java.util.List;

import com.spring.domain.Member;
import com.spring.domain.MemberAuth;

public interface MemberMapper {

	public void create(Member member) throws Exception;

	public void createAuth(MemberAuth memberAuth)throws Exception;

	public List<Member> list()throws Exception;
	
	
}
