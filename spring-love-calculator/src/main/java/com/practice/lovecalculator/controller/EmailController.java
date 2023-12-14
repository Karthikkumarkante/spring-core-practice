package com.practice.lovecalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.lovecalculator.dto.EmailDto;

@Controller
public class EmailController {
	
	@RequestMapping("/sendMail")
	public String sendMail(@ModelAttribute("mailDto") EmailDto dto) {
		return "send-mail";
	}

}
