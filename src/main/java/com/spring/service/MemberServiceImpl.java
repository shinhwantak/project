package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Member;
import com.spring.domain.MemberAuth;
import com.spring.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	
	@Autowired
	private MemberMapper mapper;

	
	@Transactional
	@Override
	public void register(Member member) throws Exception {
		mapper.create(member);
		
		System.out.println(member);
		
		MemberAuth memberAuth = new MemberAuth();
		memberAuth.setUserNo(member.getUserNo());
		memberAuth.setAuth("ROLE_MEMBER");
		
		mapper.createAuth(memberAuth);
	}


	@Override
	public List<Member> list() throws Exception {
		return mapper.list();
	}
	
}
