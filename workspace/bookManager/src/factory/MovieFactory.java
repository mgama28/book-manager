package factory;
import interfaces.IMovieFactory;
import models.DVD;
import models.BluRay;
import models.DigitalMovie;

public class MovieFactory implements IMovieFactory {
	
	@Override
	public BluRay createBluRay(int id, String title, String director, String genre, int year, int duration) {
		return new BluRay(id, title, director, genre, year, duration);
	}
	
	@Override
	public DigitalMovie createDigitalMovie(int id, String title, String director, String genre, int year, int duration) {
		return new DigitalMovie(id, title, director, genre, year, duration);
	}

	@Override
	public DVD createDVD(int id, String title, String director, String genre, int year, int duration) {
		return new DVD(id, title, director, genre, year, duration);
	}

}
