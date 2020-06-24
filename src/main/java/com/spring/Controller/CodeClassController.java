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
			
			System.out.println(codeClass);
		    
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
	
	
	
	
	
}
