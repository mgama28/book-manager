package states;
import models.LibraryItem;
import interfaces.IState;
import interfaces.ISubject;

public class CheckedOutState implements IState {
	
	private LibraryItem item;
	
	public CheckedOutState(LibraryItem item) {
		this.item = item;
	}
	
	@Override
	public void checkOut() {
		System.out.println("ERROR: Item already checked out.");
	}
	
	@Override
	public void returnItem() {
		item.increaseQuantity();
		item.setState(new AvailableState(item));
		item.notifyObservers(item);
		
	}
	
	@Override
	public void reserve() {
		System.out.println("ERROR: Item already checked out. Can't reserve at the moment.");
		
	}
}