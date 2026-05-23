package interfaces;
import models.DigitalMusic;
import models.CD;
import models.Vinyl;

public interface IMusicFactory {
	
	DigitalMusic createDigitalMusic(int id, String title, String artist, String genre, int year, int duration);
	
	CD createCD(int id, String title, String artist, String genre, int year, int duration);
	
	Vinyl createVinyl(int id, String title, String artist, String genre, int year, int duration);

}
