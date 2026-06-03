package models;

public class AudioBook extends Book{
	
	
	
	public AudioBook(int id, String title, String author, String genre, int year, int duration) {
		super(id, title, genre, author, year, duration);

	}
	
	public String getType() {
		return "audiobook";
	}
}
