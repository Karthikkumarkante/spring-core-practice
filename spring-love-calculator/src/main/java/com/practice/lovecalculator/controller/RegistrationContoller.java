package com.practice.lovecalculator.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.lovecalculator.customPropertyEditor.NamePropertyEditor;
import com.practice.lovecalculator.dto.CommunicationDto;
import com.practice.lovecalculator.dto.Phone;
import com.practice.lovecalculator.dto.RegistrationDto;

import jakarta.validation.Valid;

@Controller
public class RegistrationContoller {

	@RequestMapping("/register")
	public String register(@ModelAttribute("registrationDto") RegistrationDto dto) {
		System.out.println("Inside Registration Home Contoller endpoint method...");
		return "Registration";
	}
	
	@RequestMapping("/save")
	public String saveUser(@Valid @ModelAttribute("userInfo") RegistrationDto dto,BindingResult bindingResult) {
		System.out.println("Inside Registration save Contoller endpoint method...");
		System.out.println("Name : |"+dto.getName()+"|");
//		CommunicationDto communicationDto=new CommunicationDto();
//		Phone phone=new Phone();
//		phone.setCountryCode("91");
//		phone.setNumber("8309809155");
//		communicationDto.setPhone(phone);
//		dto.setCommunicationDto(communicationDto);
		if(bindingResult.hasErrors()) {
			bindingResult.getAllErrors().stream().forEach(System.out::println);
		}
		return "register-success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		System.out.println("Inside InitBinder Method...");
//		webDataBinder.setDisallowedFields("name");
//		StringTrimmerEditor editor=new StringTrimmerEditor(true);
//		webDataBinder.registerCustomEditor(String.class, "name", editor);
		
		//Date format editor
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor=new CustomDateEditor(dateFormat, true);
		webDataBinder.registerCustomEditor(Date.class, "date", customDateEditor);
		
		//custom property editor
		NamePropertyEditor namePropertyEditor=new NamePropertyEditor();
		webDataBinder.registerCustomEditor(String.class, "name", namePropertyEditor);
	}
}
