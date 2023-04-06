package com.kafka.producer.entity;


public class Book {
	
	private long bookId;
	private String bookName;
	private String isbnNo;
	private String authorName;
	public Book() {
		super();
	}
	
	public Book(long bookId, String bookName, String isbnNo, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.isbnNo = isbnNo;
		this.authorName = authorName;
	}

	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", isbnNo=" + isbnNo + ", authorName=" + authorName
				+ "]";
	}
	
	

}
