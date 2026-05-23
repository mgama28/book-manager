package states;
import models.LibraryItem;
import interfaces.IState;

public class ReservedState implements IState {
	
	private LibraryItem item;
	
	public ReservedState (LibraryItem item) {
		this.item = item;
	}
	
	@Override
	public void checkOut() {
		System.out.println("ERROR: Item is reserved, cannot be checked out.");
	}
	
	@Override
	public void returnItem() {
		System.out.println("ERROR: Item is reserved and cannot be returned.");
	}
	
	@Override
	public void reserve() {
		System.out.println("ERROR: Item is already reserved.");
		
	}
}