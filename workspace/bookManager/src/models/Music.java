package models;
import interfaces.IPrintable;

public class Music extends LibraryItem implements IPrintable {
	
	
	@Override
	public void print() {
		System.out.println("Music ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Year: " + getYear());
		System.out.println("Artist: " + creator);
		System.out.println("Music Genre: " + getGenre());
		System.out.println("Duration: " + getDuration());
	}
	
	public Music(int id, String title, String artist, String genre, int year, int duration) {
		super(id, title, artist, genre, year, duration);

	}
	
	public String getArtist() {
		return creator;
	}

	
}
