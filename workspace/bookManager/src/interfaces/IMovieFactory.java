package interfaces;
import models.BluRay;
import models.DigitalMovie;
import models.DVD;

public interface IMovieFactory {
	
	BluRay createBluRay(int id, String title, String director, String genre, int year, int duration);
	
	DigitalMovie createDigitalMovie(int id, String title, String director, String genre, int year, int duration);
	
	DVD createDVD(int id, String title, String director, String genre, int year, int duration);

}
