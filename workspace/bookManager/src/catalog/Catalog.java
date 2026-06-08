package catalog;
import models.LibraryItem;
import interfaces.ISearchStrategy;
import strategies.SearchByID;
import java.util.ArrayList;
import java.util.List;


public class Catalog {
	
	private List<LibraryItem> items;
	private ISearchStrategy searchStrategy;
	
	public Catalog() {
		this.items = new ArrayList<>();
	}

	
	public void addItem(LibraryItem item) {
		List<LibraryItem> existing = new SearchByID().search(items, String.valueOf(item.getId()));
		if (!existing.isEmpty()) {
			if(existing.get(0).getType().equals(item.getType())) {
				existing.get(0).increaseQuantity();
				System.out.println("Item already exists, the quantity will be increased by 1");
			}else {
				System.out.println("ERROR: ID already in use by a different item type!");
			}
		} else {
			items.add(item);
		}
	}
	
	public void removeItem(int id) {
		items.removeIf(item -> item.getId() == id);
	}
	
	public void listAllItems() {
		for (LibraryItem item : items) {
			item.print();
			System.out.println("--------------------------");
		}
	}
	
	public void setSearchStrategy(ISearchStrategy searchStrategy) {
		this.searchStrategy = searchStrategy;
	}
	
	public List<LibraryItem> search(String searchTerm){
		return searchStrategy.search(items, searchTerm);
	}
	
	public int getCatalogSize() {
		return items.size();
	}
}
 