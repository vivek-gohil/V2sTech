package com.v2ssolutions.main.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.v2ssolutions.main.model.Person;

@Controller
public class CustomValidatorController {

	@RequestMapping("/custom-validator")
	public String hello(Person person) {
		return "person";
	}

	@PostMapping("/custom-validator")
	public String demoValidation(@Valid Person person, BindingResult bindingResult) {
		System.out.println("demoValidation");
		System.out.println(bindingResult);
		if (bindingResult.hasErrors()) {

			for (FieldError fieldError : bindingResult.getFieldErrors()) {
				System.out.println(fieldError.getDefaultMessage());
			}
			return "person";
		}
		return "redirect:/results";
	}

	@RequestMapping("/success")
	public String welcome() {
		return "welcome";
	}
}