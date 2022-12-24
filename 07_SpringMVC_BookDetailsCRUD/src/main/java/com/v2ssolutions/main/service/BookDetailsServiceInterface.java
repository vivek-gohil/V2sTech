package com.v2ssolutions.main.service;

import java.util.List;

import com.v2ssolutions.main.model.BookDetails;

public interface BookDetailsServiceInterface {
	boolean addNewBookDetails(BookDetails bookDetails);

	BookDetails getBookDetailsByBookCode(int bookCode);

	boolean updateBookDetailsByBookCode(BookDetails bookDetails);

	List<BookDetails> getAllBookDetails();

	boolean deleteBookByBookCode(int bookCode);
}
