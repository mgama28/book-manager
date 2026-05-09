package factory;
import interfaces.IFactory;
import models.LibraryItem;
import models.EBook;
import models.PhysicalBook;
import models.AudioBook;

public class BookFactory implements IFactory {
	
	
	@Override
	public LibraryItem createItem(String type, int id, String title, String author, String genre, int year, int duration) {
		switch(type) {
		case "ebook":
			return new EBook(id, title, genre, author,  year, duration);
		case "audiobook":
			return new AudioBook(id, title, genre, author, year, duration);
		case "physical":
			return new PhysicalBook(id, title, genre, author, year);
		default:
			return null;
		}
	}

}
