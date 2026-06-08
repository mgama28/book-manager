package models;

public class BluRay extends Movie {

	public BluRay(int id, String title, String director, String genre, int year, int duration) {
		super(id, title, director, genre, year, duration);
	}
	
	public String getType() {
		return "bluray";
	}
}