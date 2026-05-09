package models;
import interfaces.IBorrowable;
import interfaces.IPrintable;

public abstract class LibraryItem implements IBorrowable, IPrintable {
	
	private int id;
	private String title;
	protected String creator;
	private String genre;
	private int year;
	private int duration;
	private boolean isAvailable;
	
	
public LibraryItem(int id, String title, String creator,String genre, int year, int duration) {
		
		this.id = id;
		this.title = title;
		this.creator = creator;
		this.year = year;
		this.duration = duration;
		this.isAvailable = true;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}
	
	public int getYear() {
		return year;
	}

	
	public int getDuration() {
		return duration;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public abstract void print();
	@Override
	public void checkOut() {
		isAvailable = false;
	}
	
	@Override
	public void returnedItem() {
		isAvailable = true;
	}
	
	
}
