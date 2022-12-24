package com.v2ssolutions.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@RequestMapping("/")
	public String showWelcomePage() {
		logger.info("showWelcomePage()");
		return "helloworld";
	}

	@RequestMapping("userdetails")
	public ModelAndView showUserDetailsPage() {
		return new ModelAndView("userdetails", "message", "Spring MVC is best!!");
	}

}
