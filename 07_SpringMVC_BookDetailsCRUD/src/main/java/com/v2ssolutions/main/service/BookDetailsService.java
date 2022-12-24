package com.v2ssolutions.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v2ssolutions.main.model.BookDetails;
import com.v2ssolutions.main.repository.BookDetailsRepositoryInterface;

@Service
public class BookDetailsService implements BookDetailsServiceInterface {

	@Autowired
	private BookDetailsRepositoryInterface bookDetailsRepository;

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		return bookDetailsRepository.addNewBookDetails(bookDetails);
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookCode) {
		return bookDetailsRepository.getBookDetailsByBookCode(bookCode);
	}

	@Override
	public boolean updateBookDetailsByBookCode(BookDetails bookDetails) {
		return bookDetailsRepository.updateBookDetailsByBookCode(bookDetails);
	}

	@Override
	public List<BookDetails> getAllBookDetails() {
		return bookDetailsRepository.getAllBookDetails();
	}

	@Override
	public boolean deleteBookByBookCode(int bookCode) {
		return bookDetailsRepository.deleteBookByBookCode(bookCode);
	}

}
