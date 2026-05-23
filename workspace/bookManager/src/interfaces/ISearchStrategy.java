package interfaces;
import models.LibraryItem;
import java.util.List;

public interface ISearchStrategy {
	List<LibraryItem> search(List<LibraryItem> items, String searchItem);

}

