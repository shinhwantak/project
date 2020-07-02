package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.CodeClass;
import com.spring.service.CodeClassService;

@Controller
@RequestMapping("/codeclass")
public class CodeClassController {

	@Autowired    
	private CodeClassService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerForm(Model model) {
			
		
		
		
			CodeClass codeClass = new CodeClass(); 
			
			
			
			
			System.out.println(codeClass+"뭐여ㅑ?~");
		    
			
			
			
			model.addAttribute(codeClass);
			
			
			
			
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(CodeClass codeClass, RedirectAttributes rttr) throws Exception{
		
		service.register(codeClass);
		
		return "redirect:/codeclass/list";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model)throws Exception{

		model.addAttribute("list", service.list());
		
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(String classCode, Model model)throws Exception{
		model.addAttribute(service.read(classCode));
	}
	
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyForm(String classCode, Model model) throws Exception{
		
		System.out.println("modify");
		model.addAttribute(service.read(classCode));
		
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(CodeClass codeClass, RedirectAttributes rttr) throws Exception{
		
		System.out.println(codeClass);
		
		service.modify(codeClass);
		
		rttr.addFlashAttribute("msg","SUCCESS");
		
		return "redirect:/codeclass/list";
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(String classCode, RedirectAttributes rttr)throws Exception{
		
		service.remove(classCode);
		
		rttr.addFlashAttribute("msg","처리가 완료 되었습니다~~");
		
		return "redirect:/codeclass/list";
	}
	
	
	
	
}
