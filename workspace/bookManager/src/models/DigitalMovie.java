package models;

public class DigitalMovie extends Movie {

	public DigitalMovie(int id, String title, String director, String genre, int year, int duration) {
		super(id, title, genre, director, year, duration);
	}
	
	public String getType() {
		return "Digital Movie";
	}
}