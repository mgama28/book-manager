package builder;
import models.LibraryItem;
import factory.LibraryFactory;
import interfaces.IMovieFactory;

public class MovieBuilder {
	
	private int id;
	private String title;
	private String director;
	private String genre;
	private int year;
	private int duration;
	private String type;
	
	public MovieBuilder setId(int id) {
		this.id = id;
		return this;
	}
	
	public MovieBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public MovieBuilder setDirector(String director) {
		this.director = director;
		return this;
	}
	
	public MovieBuilder setGenre(String genre) {
		this.genre = genre;
		return this;
	}
	
	public MovieBuilder setYear(int year) {
		this.year = year;
		return this;
	}
	
	public MovieBuilder setDuration(int duration) {
		this.duration = duration;
		return this;
	}
	
	public MovieBuilder setType(String type) {
		this.type = type;
		return this;
	}
	
	public LibraryItem build() {
		IMovieFactory factory = new LibraryFactory().getMovieFactory();
		switch(type) {
		case "bluray": return factory.createBluRay(id, title, director, genre, year, duration);
		case "digital": return factory.createDigitalMovie(id, title, director, genre, year, duration);
		case "dvd": return factory.createDVD(id, title, director, genre, year, duration);
		default: return null;
		}
	}

}
