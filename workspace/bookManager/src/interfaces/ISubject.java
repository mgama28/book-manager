package interfaces;
import models.LibraryItem;

public interface ISubject {
	void addObserver(IObserver observer);
	void removeObserver(IObserver observer);
	void notifyObservers(LibraryItem item);

}
