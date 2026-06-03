package models;

public class DigitalMusic extends Music {

	public DigitalMusic(int id, String title, String artist, String genre, int year, int duration) {
		super(id, title, genre, artist, year, duration);
	}
	
	public String getType() {
		return "digitalMusic";
	}
}