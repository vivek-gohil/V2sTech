package com.v2ssolutions.main.model;

import com.v2ssolutions.main.validator.FieldMatch;

@FieldMatch(first = "email", second = "confirmEmail", message = "Email does not match")
public class Person {
	private String name;
	private String email;
	private String confirmEmail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
}