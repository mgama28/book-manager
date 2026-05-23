package strategies;
import interfaces.ISearchStrategy;
import models.LibraryItem;
import java.util.ArrayList;
import java.util.List;

public class SearchByCreator implements ISearchStrategy {
	
	@Override
	public List<LibraryItem> search(List<LibraryItem> items, String searchItem){
		List<LibraryItem> results = new ArrayList<>();
		for(LibraryItem item : items) {
			if (item.getCreator().equalsIgnoreCase(searchItem)) {
				results.add(item);
			}
		}
		return results;
	}
}
