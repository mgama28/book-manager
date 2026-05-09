package models;
import interfaces.IPrintable;

public class Book extends LibraryItem implements IPrintable {
	
	@Override
	public void print() {
		System.out.println("Book ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Year: "+ getYear());
		System.out.println("Author: " + creator);
		System.out.println("Genre: " + getGenre());
	}
	
	
	public Book(int id, String title, String author, String genre, int year, int duration) {
		super(id, title, author, genre, year, 0);


	}
	
	public String getAuthor() {
		return creator;
	}
	
	
}
