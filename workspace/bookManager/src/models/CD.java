package models;

public class CD extends Music {

	public CD(int id, String title, String artist, String genre, int year, int duration) {
		super(id, title, genre, artist, year, duration);
	}
	
	public String getType() {
		return "CD";
	}
}
