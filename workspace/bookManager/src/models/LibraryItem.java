package models;
import interfaces.Borrowable;

public abstract class LibraryItem implements Borrowable {
	
	private int id;
	private String title;
	private boolean isAvailable;
	
	@Override
	public void checkOut() {
		isAvailable = false;
	}
	
	@Override
	public void returnedItem() {
		isAvailable = true;
	}
	
	public LibraryItem(int id, String title) {
		
		this.id = id;
		this.title = title;
		this.isAvailable = true;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
}
