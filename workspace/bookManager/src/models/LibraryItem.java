package models;
import java.util.List;
import java.util.ArrayList;
import interfaces.IPrintable;
import interfaces.IState;
import interfaces.ISubject;
import interfaces.IObserver;
import states.AvailableState;

public abstract class LibraryItem implements IPrintable, ISubject {
	
	private int id;
	private String title;
	protected String creator;
	private String genre;
	private int year;
	private int duration;

	private boolean isReserved;
	private IState currentState;
	private int quantity;
	
	private List<IObserver> observers;
	
	
	
	public LibraryItem(int id, String title, String creator,String genre, int year, int duration) {
			
			this.id = id;
			this.title = title;
			this.creator = creator;
			this.genre = genre;
			this.year = year;
			this.duration = duration;
			this.isReserved = false;
			this.currentState = new AvailableState(this);
			this.quantity = 1;
			this.observers = new ArrayList<>();
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
	
	// ISubject ------------------------------------------------------
	
	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}
	
	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers(LibraryItem item) {
		for(IObserver observer : observers) {
			observer.update(item);
		}
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
	public boolean isAvailable() {
		return quantity > 0;
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
	
	
	// Quantity ---------------------------------------------------
	
	//getter
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void increaseQuantity() {
		quantity++;
	}
	
	public void decreaseQuantity() {
		if(quantity > 0) {
			quantity--;
		}else {
			System.out.println("No copies available!");
		}
	}
	// Print ------------------------------------------------------
	
	public abstract void print();
	
	// Type ------------------------------------------------------
	
	public abstract String getType();
	
}
