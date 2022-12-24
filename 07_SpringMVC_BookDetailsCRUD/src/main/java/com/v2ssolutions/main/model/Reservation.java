package com.v2ssolutions.main.model;

import java.util.Arrays;

public class Reservation {
	private String firstName;
	private String lastName;
	private String gender;
	private String[] food;
	private String cityFrom;
	private String cityTo;

	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(String firstName, String lastName, String gender, String[] food, String cityFrom,
			String cityTo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.food = food;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	@Override
	public String toString() {
		return "Reservation [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", food="
				+ Arrays.toString(food) + ", cityFrom=" + cityFrom + ", cityTo=" + cityTo + "]";
	}

}
