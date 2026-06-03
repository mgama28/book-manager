package models;

public class Vinyl extends Music {

	public Vinyl(int id, String title, String artist, String genre, int year, int duration) {
		super(id, title, genre, artist, year, duration);
	}
	
	public String getType() {
		return "vinyl";
	}
}