package models;

public class DVD extends Movie {

	public DVD(int id, String title, String director, String genre, int year, int duration) {
		super(id, title, director, genre, year, duration);
	}
	
	public String getType() {
		return "dvd";
	}
}