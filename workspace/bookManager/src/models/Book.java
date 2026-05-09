package models;
import interfaces.IPrintable;

public abstract class Book extends LibraryItem implements IPrintable {
	
	public Book(int id, String title, String author, String genre, int year, int duration) {
		super(id, title, author, genre, year, duration);
	}
	
	public abstract String getType();
	
	public String getAuthor() {
		return creator;
	}
	
	@Override
	public void print() {
		System.out.println("Book ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Year: "+ getYear());
		System.out.println("Author: " + creator);
		System.out.println("Genre: " + getGenre());
	}
	
}