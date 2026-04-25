package catalog;

import models.LibraryItem;
import java.util.ArrayList;
import java.util.List;


public class Catalog {
	
	private List<LibraryItem> items;
	
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
			System.out.println(item);
		}
	}
	
	public LibraryItem searchByTitle(String title) {
		for (LibraryItem item : items) {
			if(item.getTitle().equalsIgnoreCase(title)) {
				return item;
			}
		}
		return null;
	}
}
