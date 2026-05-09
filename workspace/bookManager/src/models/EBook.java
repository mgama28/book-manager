package models;

public class EBook extends Book{
	
	
	
	public EBook(int id, String title, String author, String genre, int year, int duration) {
		super(id, title, genre, author, year, duration);

	}
	
	public String getType() {
		return "EBook";
	}
}
