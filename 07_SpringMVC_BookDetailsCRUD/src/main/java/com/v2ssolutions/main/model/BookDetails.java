package com.v2ssolutions.main.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookDetails {
	@NotNull
	private int bookCode;

	@NotNull
	@Size(min = 2, max = 30)
	private String title;
	@NotNull
	@Size(min = 2, max = 30)
	private String author;

	@Min(100)
	private double price;

	private boolean isIssuable;

	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookDetails(int bookCode, String title, String author, double price, boolean isIssuable) {
		super();
		this.bookCode = bookCode;
		this.title = title;
		this.author = author;
		this.price = price;
		this.isIssuable = isIssuable;
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsIssuable() {
		return isIssuable;
	}

	public void setIssuable(boolean isIssuable) {
		this.isIssuable = isIssuable;
	}

	@Override
	public String toString() {
		return "BookDetails [bookCode=" + bookCode + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", isIssuable=" + isIssuable + "]";
	}

}
