package interfaces;
import models.PhysicalBook;
import models.AudioBook;
import models.EBook;

public interface IBookFactory {
	
	PhysicalBook createPhysicalBook(int id, String title, String author, String genre, int year);
	
	AudioBook createAudioBook(int id, String title, String author, String genre, int year, int duration);
	
	EBook createEBook(int id, String title, String author, String genre, int year, int duration);

}
