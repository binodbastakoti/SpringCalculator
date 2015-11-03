package com.binod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.binod.model.Number;
import com.binod.validator.Validator;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CalculatorController {

	@Autowired
	Validator validator;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String calculator() {
		return "Calculator";
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String calculate(Number input, Model model) {
		Number result = validator.validate(input);
		model.addAttribute("output", result);
		return "Calculator";
	}

}
