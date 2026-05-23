package factory;
import interfaces.IMusicFactory;
import models.DigitalMusic;
import models.CD;
import models.Vinyl;


public class MusicFactory implements IMusicFactory {
	
	
	@Override
	public DigitalMusic createDigitalMusic(int id, String title, String artist, String genre, int year, int duration) {
		return new DigitalMusic(id, title, artist, genre, year, duration);
	}
	
	@Override
	public CD createCD(int id, String title, String artist, String genre, int year, int duration) {
		return new CD(id, title, artist, genre, year, duration);
	}

	@Override
	public Vinyl createVinyl(int id, String title, String artist, String genre, int year, int duration) {
		return new Vinyl(id, title, artist, genre, year, duration);
	}
	

}