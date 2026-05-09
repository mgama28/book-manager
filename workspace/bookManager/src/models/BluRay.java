package models;

public class BluRay extends Movie {

	public BluRay(int id, String title, String director, String genre, int year, int duration) {
		super(id, title, genre, director, year, duration);
	}
	
	public String getType() {
		return "Blu-Ray";
	}
}