package factory;
import interfaces.IFactory;
import models.LibraryItem;
import models.CD;
import models.Vinyl;
import models.DigitalMusic;

public class MusicFactory implements IFactory {
	
	
	@Override
	public LibraryItem createItem(String type, int id, String title, String artist, String genre, int year, int duration) {
		switch(type) {
		case "cd":
			return new CD(id, title, genre, artist,  year, duration);
		case "vinyl":
			return new Vinyl(id, title, genre, artist, year, duration);
		case "digital music":
			return new DigitalMusic(id, title, genre, artist, year, duration);
		default:
			return null;
		}
	}

}