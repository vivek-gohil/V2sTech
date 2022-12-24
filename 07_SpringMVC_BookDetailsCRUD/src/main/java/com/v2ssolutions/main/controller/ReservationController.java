package com.v2ssolutions.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.v2ssolutions.main.model.Reservation;

@Controller
public class ReservationController {

	@RequestMapping("bookingform")
	public String bookingForm(Model model) {
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservationpage";
	}

	@RequestMapping("submitform")
	public String submitForm(Reservation reservation) {
		return "confirmationform";
	}
}
