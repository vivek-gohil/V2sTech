package com.v2ssolutions.main.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.v2ssolutions.main.model.NewUserForm;

@Controller
public class NewUserController {

	public NewUserController() {
		System.out.println("NewUserController");
	}

	@GetMapping("/userhome")
	public String loadFormPage(Model model) {
		model.addAttribute("newUserForm", new NewUserForm());
		return "user";
	}

	@PostMapping("/user")
	public String submitForm(@Valid NewUserForm newUserForm, BindingResult result, Model model) {
		System.out.println("submitForm");
		if (result.hasErrors()) {
			System.out.println("has errors");
			return "user";
		}
		model.addAttribute("message", "Valid form");
		return "user";
	}
}
