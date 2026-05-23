package commands;
import models.LibraryItem;
import interfaces.ICommand;


public class ReturnItemCommand implements ICommand{
	
	private LibraryItem item;
	
	public ReturnItemCommand(LibraryItem item) {
		this.item = item;
	}
	
	@Override
	public void execute() {
		item.returnItem();
	}
}