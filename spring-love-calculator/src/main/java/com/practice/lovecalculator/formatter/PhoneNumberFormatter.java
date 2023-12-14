package com.practice.lovecalculator.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.practice.lovecalculator.dto.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		return object.getCountryCode()+"-"+object.getNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		String[] res=text.split("-");
		Phone phone=new Phone();
		phone.setCountryCode(res[0]);
		phone.setNumber(res[1]);
		return phone;
	}

	
}
