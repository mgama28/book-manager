package factory;
import interfaces.IFactory;
import models.LibraryItem;
import models.DVD;
import models.BluRay;
import models.DigitalMovie;

public class MovieFactory implements IFactory {
	
	
	@Override
	public LibraryItem createItem(String type, int id, String title, String author, String genre, int year, int duration) {
		switch(type) {
		case "dvd":
			return new DVD(id, title, genre, author, year, duration);
		case "blu-ray":
			return new BluRay(id, title, genre, author, year, duration);
		case "digital movie":
			return new DigitalMovie(id, title, genre, author, year, duration);
		default:
			return null;
		}
	}

}
