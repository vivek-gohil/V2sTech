package com.v2ssolutions.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.v2ssolutions.main.model.BookDetails;

@Repository
public class BookDetailsRepository implements BookDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String GET_ALL_BOOK_DETAILS = "SELECT * FROM BOOK_DETAILS";
	private static final String INSERT_NEW_BOOK_DETAILS = "INSERT INTO BOOK_DETAILS(TITLE,AUTHOR,PRICE,IS_ISSUABLE) VALUES(?,?,?,?)";
	private static final String GET_SINGLE_BOOK_DETAILS_BY_BOOK_CODE = "SELECT * FROM BOOK_DETAILS WHERE BOOK_CODE = ?";
	private static final String UPDATE_BOOK_DETAILS_BY_BOOK_CODE = "UPDATE BOOK_DETAILS SET TITLE=? , AUTHOR=? , PRICE=? , IS_ISSUABLE=? WHERE BOOK_CODE=?";
	private static final String DELETE_BOOK_DETAILS_BY_BOOK_CODE = "DELETE FROM BOOK_DETAILS WHERE BOOK_CODE = ?";

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		Object[] params = { bookDetails.getTitle(), bookDetails.getAuthor(), bookDetails.getPrice(),
				bookDetails.getIsIssuable() };
		int updatedRows = jdbcTemplate.update(INSERT_NEW_BOOK_DETAILS, params);
		if (updatedRows > 0)
			return true;
		return false;
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookCode) {
		BookDetails bookDetails = jdbcTemplate.queryForObject(GET_SINGLE_BOOK_DETAILS_BY_BOOK_CODE,
				new BookDetailsRowMapper(), bookCode);
		return bookDetails;
	}

	@Override
	public boolean updateBookDetailsByBookCode(BookDetails bookDetails) {
		Object[] params = { bookDetails.getTitle(), bookDetails.getAuthor(), bookDetails.getPrice(),
				bookDetails.getIsIssuable(), bookDetails.getBookCode() };
		int updatedRows = jdbcTemplate.update(UPDATE_BOOK_DETAILS_BY_BOOK_CODE, params);
		if (updatedRows > 0)
			return true;
		return false;
	}

	@Override
	public List<BookDetails> getAllBookDetails() {
		List<BookDetails> allBookDetails = jdbcTemplate.query(GET_ALL_BOOK_DETAILS, new BookDetailsRowMapper());
		return allBookDetails;
	}

	@Override
	public boolean deleteBookByBookCode(int bookCode) {
		int updatedRows = jdbcTemplate.update(DELETE_BOOK_DETAILS_BY_BOOK_CODE, bookCode);
		if (updatedRows > 0)
			return true;
		return false;
	}

}
