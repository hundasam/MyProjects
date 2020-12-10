package com.library.pojo;

import java.util.Date;

public class IssueBook {
	private int bookId;
	private String bookName;
	private Date issueDate;
	private Date returnDate;
	
	public IssueBook() {}
		
	public IssueBook(int bookId, String bookName, Date issueDate, Date returnDate) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
}
