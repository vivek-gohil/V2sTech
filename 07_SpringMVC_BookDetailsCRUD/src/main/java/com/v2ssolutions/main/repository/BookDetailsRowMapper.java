package com.v2ssolutions.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.v2ssolutions.main.model.BookDetails;

public class BookDetailsRowMapper implements RowMapper<BookDetails> {

	@Override
	public BookDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookDetails bookDetails = new BookDetails();
		bookDetails.setBookCode(rs.getInt("book_code"));
		bookDetails.setTitle(rs.getString("title"));
		bookDetails.setAuthor(rs.getString("author"));
		bookDetails.setPrice(rs.getDouble("price"));
		bookDetails.setIssuable(rs.getBoolean("is_issuable"));
		return bookDetails;
	}

}
