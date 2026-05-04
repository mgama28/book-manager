package models;
import interfaces.Printable;

public class Movie extends LibraryItem implements Printable {
	
	private String movieDirector;
	private String movieGenre;
	private int movieYear;
	private int movieDuration;
	
	@Override
	public void print() {
		System.out.println("Movie ID: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Movie Director: " + movieDirector);
		System.out.println("Movie Year: " + movieYear);
		System.out.println("Movie Duration: " + movieDuration);
		
	}
	
	public Movie(int id, String title, String director, String genre, int year, int duration) {
		super(id, title);
		this.movieDirector = director;
		this.movieGenre = genre;
		this.movieYear = year;
		this.movieDuration = duration;
	}
	
	public String getMovieDirector() {
		return movieDirector;
	}
	
	public String getMovieGenre() {
		return movieGenre;
	}
	
	public int getMovieYear() {
		return movieYear;
	}
	
	public int getMovieDuration() {
		return movieDuration;
	}

}
