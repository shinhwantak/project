package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.CodeDetail;
import com.spring.domain.CodeLabelValue;
import com.spring.service.CodeDetailService;
import com.spring.service.CodeService;


@Controller
@RequestMapping("/codedetail")
public class CodeDetailController {

	
	@Autowired
	private CodeDetailService codeDetailService;
	
	@Resource
	private CodeService codeService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerForm(Model model)throws Exception{
		
		CodeDetail codeDetail = new CodeDetail();
		model.addAttribute(codeDetail);
		
		List<CodeLabelValue> classCodeList = codeService.getCodeClassList("A01");
		
		System.out.println(classCodeList);
		model.addAttribute("classCodeList", classCodeList);
		
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(CodeDetail codeDetail, RedirectAttributes rttr) throws Exception{
		
		codeDetailService.register(codeDetail);
		
		rttr.addFlashAttribute("msg","메메메~");
		
		
		return "redirect:/codedetail/list";		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		model.addAttribute("list",codeDetailService.list());
	}
	
	
}
