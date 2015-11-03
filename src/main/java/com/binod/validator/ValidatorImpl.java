package com.binod.validator;

import org.springframework.stereotype.Component;

import com.binod.model.Number;

@Component
public class ValidatorImpl implements Validator {
	
	Number number;
	
	@Override
	public Number validate(Number input) {
		number = input;
		number.setNum1(parseInteger(input.getNum1()));
		number.setNum2(parseInteger(input.getNum2()));
		number.setNum3(parseInteger(input.getNum3()));
		number.setNum4(parseInteger(input.getNum4()));
		return number;
	}

	private String parseInteger(String num) {
		try {
			Integer.parseInt(num);
			return num;
		} catch (NumberFormatException ex) {
			return "";
		}
	}

	
}