package models;
import interfaces.IPrintable;

public abstract class Movie extends LibraryItem implements IPrintable {

	
	public Movie(int id, String title, String director, String genre, int year, int duration) {
		super(id, title, director, genre, year, duration);
	}
	
	public abstract String getType();
	
	public String getDirector() {
		return creator;
	}
	
	@Override
	public void print() {
		System.out.println("Movie ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Year: " + getYear());
		System.out.println("Movie Director: " + getDirector());
		System.out.println("Movie Genre: " + getGenre());
		System.out.println("Movie Duration: " + getDuration());
	}
}
