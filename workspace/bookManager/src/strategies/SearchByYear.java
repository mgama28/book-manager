package strategies;
import interfaces.ISearchStrategy;
import models.LibraryItem;
import java.util.ArrayList;
import java.util.List;

public class SearchByYear implements ISearchStrategy {
	
	@Override
	public List<LibraryItem> search(List<LibraryItem> items, String searchItem){
		List<LibraryItem> results = new ArrayList<>();
		for(LibraryItem item : items) {
			try {
				int year = Integer.parseInt(searchItem);
				if (item.getYear() == year) {
					results.add(item);
				}
				
			} catch(NumberFormatException e) {
				System.out.println("Please enter a valid year!");
				break;
			}
			
			
		}
		return results;
	}
}
