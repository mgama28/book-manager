package commands;
import catalog.Catalog;
import interfaces.ICommand;

public class SearchItemCommand implements ICommand {
	
	private String item;
	private Catalog catalog;
	
	public SearchItemCommand(Catalog catalog, String item) {
		this.catalog = catalog;
		this.item = item;
	}
	
	@Override
	public void execute() {
		catalog.searchByTitle(item);
	}
}
