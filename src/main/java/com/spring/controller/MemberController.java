package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.CodeLabelValue;
import com.spring.domain.Member;
import com.spring.service.CodeService;
import com.spring.service.MemberService;

@Controller
@RequestMapping(value = "/user")
public class MemberController  {

	
	@Autowired
	private MemberService service;
	
	@Autowired
	private CodeService codeService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerForm(Member member, Model model) throws Exception{
		System.out.println("등록 겟");
		String classCode = "A01";
		
		List<CodeLabelValue>  jobList = codeService.getCodeClassList(classCode);
		
		System.out.println("잡리스트 " + jobList);
		
		model.addAttribute("jobList",jobList);
		
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	//Validated 값 검증  BindingResult 클래스에서 객체값을 검증하는 방식
	public String register(@Validated Member member, BindingResult result,Model model, RedirectAttributes rttr)throws Exception {
		
		//에러가 있는지 확인함 
		if(result.hasErrors()) {
			String classCode = "A01";
			List<CodeLabelValue> jobList  = codeService.getCodeClassList(classCode);
			model.addAttribute("jobList", jobList);
			return "user/register";
		}
		
			String inputPassword = member.getUserPw();
			member.setUserPw(passwordEncoder.encode(inputPassword));
			
			service.register(member);
			
			rttr.addFlashAttribute("userName", member.getUserName());
			return "redirect:/user/registerSuccess";
		
		
	}
	
	
	@RequestMapping(value = "/registerSuccess", method = RequestMethod.GET)
	public void registerSuccess(Model model) throws Exception{
		
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public void list(Model model)throws Exception{
		model.addAttribute("list",service.list());
	}
	
	
}
