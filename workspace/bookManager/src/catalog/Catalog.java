package catalog;
import models.LibraryItem;
import interfaces.ISearchStrategy;
import java.util.ArrayList;
import java.util.List;


public class Catalog {
	
	private List<LibraryItem> items;
	private ISearchStrategy searchStrategy;
	
	public Catalog() {
		this.items = new ArrayList<>();
	}

	
	public void addItem(LibraryItem item) {
		items.add(item);
	}
	
	public void removeItem(int id) {
		items.removeIf(item -> item.getId() == id);
	}
	
	public void listAllItems() {
		for (LibraryItem item : items) {
			item.print();
		}
	}
	
	public void setSearchStrategy(ISearchStrategy searchStrategy) {
		this.searchStrategy = searchStrategy;
	}
	
	public List<LibraryItem> search(String searchTerm){
		return searchStrategy.search(items, searchTerm);
	}
}
