package models;
import interfaces.Printable;

public class Book extends LibraryItem implements Printable {
	
	private String bookAuthor;
	private String bookGenre;
	private int bookYear;
	
	@Override
	public void print() {
		System.out.println("Book ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + bookAuthor );
		System.out.println("Genre: " + bookGenre);
	}
	
	
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
