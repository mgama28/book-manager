package interfaces;
import models.LibraryItem;

public interface IFactory {
	LibraryItem createItem(String type, int id, String title, String creator, String genre, int year, int duration);
}
