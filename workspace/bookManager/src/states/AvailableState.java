package states;
import models.LibraryItem;
import interfaces.IState;

public class AvailableState implements IState {
	
	private LibraryItem item;
	
	public AvailableState(LibraryItem item) {
		this.item = item;
	}
	
	@Override
	public void checkOut() {
		item.decreaseQuantity();
		if (item.getQuantity() == 0) {
			item.setState(new CheckedOutState(item));
		}
		
	}
	
	@Override
	public void returnItem() {
		System.out.println("ERROR: Item cannot be returned, it's available");
	}
	
	@Override
	public void reserve() {
		item.setState(new ReservedState(item));
		
	}
}
