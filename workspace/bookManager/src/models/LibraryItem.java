package models;
import interfaces.IPrintable;
import interfaces.IState;
import states.AvailableState;

public abstract class LibraryItem implements IPrintable {
	
	private int id;
	private String title;
	protected String creator;
	private String genre;
	private int year;
	private int duration;
	private boolean isAvailable;
	private boolean isReserved;
	private IState currentState;
	
	
	public LibraryItem(int id, String title, String creator,String genre, int year, int duration) {
			
			this.id = id;
			this.title = title;
			this.creator = creator;
			this.genre = genre;
			this.year = year;
			this.duration = duration;
			this.isAvailable = true;
			this.isReserved = false;
			this.currentState = new AvailableState(this);
		}
//------------------------------------------------------
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCreator() {
		return creator;
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
	
	// State ------------------------------------------------------
	
	//setter
	public void setState(IState state) {
		this.currentState = state;
	}
	
	//getter
	public IState getState() {
		return currentState;
	}
	
	//checkedOut
	public void checkOut() {
		currentState.checkOut();
	}
	
	//returnItem
	public void returnItem() {
		currentState.returnItem();
	}
	
	//reserve
	public void reserve() {
		currentState.reserve();
	}
	
	// Available ------------------------------------------------------
	
	//setter
	public void setAvailable(boolean available) {
		this.isAvailable = available;
	}
	
	//getter
	public boolean isAvailable() {
		return isAvailable;
	}
	
	// Reserved ------------------------------------------------------
	
	//setter
	public void setReserved(boolean reserved) {
		this.isReserved = reserved;
	}
	
	//getter
	public boolean isReserved() {
		return isReserved;
	}
	
	// Print ------------------------------------------------------
	
	public abstract void print();
	
	
}
