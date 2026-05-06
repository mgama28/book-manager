package commands;
import catalog.Catalog;
import interfaces.ICommand;

public class RemoveItemCommand implements ICommand{
	
	private int item;
	private Catalog catalog;
	
	public RemoveItemCommand(Catalog catalog, int item) {
		this.item = item;
		this.catalog = catalog;
	}
	
	@Override
	public void execute() {
		catalog.removeItem(item);
	}

}
