package commands;
import models.LibraryItem;
import interfaces.ICommand;


public class CheckOutCommand implements ICommand{
	
	private LibraryItem item;
	
	public CheckOutCommand(LibraryItem item) {
		this.item = item;
	}
	
	@Override
	public void execute() {
		item.checkOut();
	}
}
