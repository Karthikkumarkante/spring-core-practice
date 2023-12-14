package com.practice.lovecalculator.customValidators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	private int minAge;
	private int maxAge;
	@Override
	public void initialize(Age age) {
		//can write post construcct works
		this.minAge=age.min();
		this.maxAge=age.max();
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		if(age==null)
			return false;
		if(age<minAge || age>maxAge)
			return false;
		else
			return true;
	}

}
