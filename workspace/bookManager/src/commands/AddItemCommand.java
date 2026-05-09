package commands;
import models.LibraryItem;
import catalog.Catalog;
import interfaces.ICommand;

public class AddItemCommand implements ICommand{
	
	private LibraryItem item;
	private Catalog catalog;
	
	public AddItemCommand(Catalog catalog,LibraryItem item) {
		this.item = item;
		this.catalog = catalog;
	}
	@Override
	public void execute() {
		catalog.addItem(item);
	}
}
