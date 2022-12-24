package com.v2ssolutions.main.repository;

import java.util.List;

import com.v2ssolutions.main.model.BookDetails;

public interface BookDetailsRepositoryInterface {
	boolean addNewBookDetails(BookDetails bookDetails);

	BookDetails getBookDetailsByBookCode(int bookCode);

	boolean updateBookDetailsByBookCode(BookDetails bookDetails);

	List<BookDetails> getAllBookDetails();

	boolean deleteBookByBookCode(int bookCode);
}
