package models;

public class Book extends LibraryItem {
	
	private String bookAuthor;
	private String bookGenre;
	private int bookYear;
	
	
	public Book(int id, String title, String author, String genre, int year) {
		super(id, title);
		this.bookAuthor = author;
		this.bookGenre = genre;
		this.bookYear = year;

	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public String getBookGenre() {
		return bookGenre;
	}
	
	public int getBookYear() {
		return bookYear;
	}
}
