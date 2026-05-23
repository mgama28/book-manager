package factory;
import interfaces.IBookFactory;
import models.EBook;
import models.PhysicalBook;
import models.AudioBook;


public class BookFactory implements IBookFactory {
	
	
	@Override
	public PhysicalBook createPhysicalBook(int id, String title, String author, String genre, int year) {
		return new PhysicalBook(id, title, author, genre, year);
	}
	
	@Override
	public AudioBook createAudioBook(int id, String title, String author, String genre, int year, int duration) {
		return new AudioBook(id, title, title, genre, year, duration);
	}

	@Override
	public EBook createEBook(int id, String title, String author, String genre, int year, int duration) {
		return new EBook(id, title, author, genre, year, duration);
	}

}
