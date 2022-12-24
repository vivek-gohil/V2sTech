package com.v2ssolutions.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.v2ssolutions.main.model.BookDetails;
import com.v2ssolutions.main.service.BookDetailsServiceInterface;

@Controller
public class BookDetailsController {
	@Autowired
	private BookDetailsServiceInterface bookDetailsService;

	@RequestMapping("books")
	public String showAllBookDetailsPage(Model model) {
		List<BookDetails> allBookDetails = bookDetailsService.getAllBookDetails();
		model.addAttribute("allBookDetails", allBookDetails);
		return "bookdetailshome";
	}

	@RequestMapping("addnewbook")
	public String showAddNewBookDetailsPage(Model model) {
		BookDetails bookDetails = new BookDetails();
		model.addAttribute("bookDetails", bookDetails);
		return "addnewbookdetails";

	}

	@RequestMapping("savebookdetails")
	public String showBookDetailsHome(@Valid BookDetails bookDetails, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "addnewbookdetails";
		} else {
			System.out.println(bookDetails);
			boolean result = bookDetailsService.addNewBookDetails(bookDetails);
			System.out.println(result);
			if (result)
				return "redirect:/books";
			return "error";
		}
	}
}
