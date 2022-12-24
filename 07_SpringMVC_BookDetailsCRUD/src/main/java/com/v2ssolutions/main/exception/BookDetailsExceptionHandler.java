package com.v2ssolutions.main.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class BookDetailsExceptionHandler {

	public BookDetailsExceptionHandler() {
		System.out.println("BookDetailsExceptionHandler created");
	}

	@ExceptionHandler(value = Exception.class)
	public ModelAndView AnyOtherHandler(Exception exception) {
		System.out.println("AnyOtherHandler");
		ModelAndView model = new ModelAndView();
		model.addObject("err", "Exception :: " + exception.getMessage());
		model.setViewName("error");
		return model;
	}
}
