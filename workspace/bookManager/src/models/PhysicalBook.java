package models;

public class PhysicalBook extends Book{
	
	
	
	public PhysicalBook(int id, String title, String author, String genre, int year) {
		super(id, title, genre, author, year, 0);

	}
	
	public String getType() {
		return "Physical";
	}
}
