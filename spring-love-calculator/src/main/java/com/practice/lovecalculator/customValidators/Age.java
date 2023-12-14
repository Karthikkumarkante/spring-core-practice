package com.practice.lovecalculator.customValidators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
	
	String message() default "Age should be between {min} and {max}";

	int min() default 20;

	int max() default 50;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
