package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.CodeClass;
import com.spring.service.CodeClassService;

@Controller
@RequestMapping("/codeclass")
public class CodeClassController {

	@Autowired    
	private CodeClassService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerForm(Model modle) {
	
			CodeClass codeClass = new CodeClass(); 
			
			codeClass.
	}
	
}
