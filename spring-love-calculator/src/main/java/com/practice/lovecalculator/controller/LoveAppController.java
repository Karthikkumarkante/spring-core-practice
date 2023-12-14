package com.practice.lovecalculator.controller;



import java.util.Currency;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.lovecalculator.dto.UserDto;

import jakarta.validation.Valid;

@Controller
public class LoveAppController {

//	@RequestMapping("/")
//	public String homePage() {
//		return "homepage";
//	}
	
	//Two way binding approach-1
//	@RequestMapping("/")
//	public String homePage(Model model) {
//		UserDto dto=new UserDto();
//		model.addAttribute("userInfo",dto);
//		return "homepage";
//	}
	
	//Two way binding approach-2
	@RequestMapping("/")
	public String homePage(@Valid @ModelAttribute("userInfo") UserDto dto,BindingResult bindingResult)
	{
		System.out.println("Inside home controller...");
		//Currency.getAvailableCurrencies().stream().forEach(System.out::println);
		Currency currency=Currency.getInstance(new Locale("en", "IN"));
//		currency.
//		System.out.println("Display Name:"+currency.getDisplayName());
		System.out.println("Currency Code :"+currency.getCurrencyCode());
		
//		if(bindingResult.hasErrors()) {
//			System.out.println("Error count :"+ bindingResult.getErrorCount());
//			System.out.print("Eoor Field :");
//			bindingResult.getAllErrors().stream().forEach(System.out::println);
//		}
		return "homepage";
	}
	
	
	//using requestParams
//	@RequestMapping("/loveResult-page")
//	public String lovePercentPage(@RequestParam String userName,
//			@RequestParam String crushName,Model model) {
//		System.out.println("Your Name:"+ userName);
//		System.out.println("Crush Name:"+crushName);
//		model.addAttribute("youName", userName);
//		model.addAttribute("crushName", crushName);
//		
//		return "love-percent-page";
//	}
	
	  //approach-1
//	@RequestMapping("/loveResult-page")
//	public String lovePercentPage(UserDto userDto,Model model) {
//		model.addAttribute("userDto", userDto);
//		return "love-percent-page";
//	}
	
	@RequestMapping("/loveResult-page")
	public String lovePercentPage(@Valid @ModelAttribute("userInfo") UserDto userDto,BindingResult bindingResult) {
		System.out.println("In The controller End-point");
//		if(!bindingResult.hasErrors()) {
//			System.out.println("No Errors Occured... all valid data");
//		}
		if(bindingResult.hasErrors()) {
			System.out.println("MY From Has Errors");
			System.out.println("Error count :"+ bindingResult.getErrorCount());
			System.out.print("Eoor Field :");
			bindingResult.getAllErrors().stream().forEach(System.out::println);
			return "homepage";
		}
		return "love-percent-page";
	}
}
