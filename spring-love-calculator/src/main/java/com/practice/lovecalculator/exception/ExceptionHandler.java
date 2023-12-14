package com.practice.lovecalculator.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	public ExceptionHandler() {
		System.out.println("MY CUSTOM EXCEPTION HANDLER CLASS");
	}

}
