package builder;
import models.LibraryItem;
import factory.LibraryFactory;
import interfaces.IMusicFactory;

public class MusicBuilder {
	
	private int id;
	private String title;
	private String artist;
	private String genre;
	private int year;
	private int duration;
	private String type;
	
	public MusicBuilder setId(int id) {
		this.id = id;
		return this;
	}
	
	public MusicBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public MusicBuilder setArtist(String artist) {
		this.artist = artist;
		return this;
	}
	
	public MusicBuilder setGenre(String genre) {
		this.genre = genre;
		return this;
	}
	
	public MusicBuilder setYear(int year) {
		this.year = year;
		return this;
	}
	
	public MusicBuilder setDuration(int duration) {
		this.duration = duration;
		return this;
	}
	
	public MusicBuilder setType(String type) {
		this.type = type;
		return this;
	}
	
	public LibraryItem build() {
		IMusicFactory factory = new LibraryFactory().getMusicFactory();
		switch(type) {
		case "digital": return factory.createDigitalMusic(id, title, artist, genre, year, duration);
		case "cd": return factory.createCD(id, title, artist, genre, year, duration);
		case "vinyl": return factory.createVinyl(id, title, artist, genre, year, duration);
		default: return null;
		}
	}

}