package models;

public class LibraryItem {
	
	private int id;
	private String title;
	private boolean isAvailable;
	
	
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
}
