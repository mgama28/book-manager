package commands;
import catalog.Catalog;
import interfaces.ICommand;

public class RemoveItemCommand implements ICommand{
	
	private int id;
	private Catalog catalog;
	
	public RemoveItemCommand(Catalog catalog, int id) {
		this.id = id;
		this.catalog = catalog;
	}
	
	@Override
	public void execute() {
		catalog.removeItem(id);
	}

}
