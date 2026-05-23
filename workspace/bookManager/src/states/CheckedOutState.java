package states;
import models.LibraryItem;
import interfaces.IState;

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
		item.setAvailable(true);
		item.setState(new AvailableState(item));
	}
	
	@Override
	public void reserve() {
		System.out.println("ERROR: Item already checked out. Can't reserve at the moment.");
		
	}
}