package commands;
import catalog.Catalog;
import interfaces.ICommand;
import interfaces.ISearchStrategy;

public class SearchItemCommand implements ICommand {
	
	private String item;
	private Catalog catalog;
	private ISearchStrategy searchStrategy;
	
	public SearchItemCommand(Catalog catalog, String item, ISearchStrategy searchStrategy) {
		this.catalog = catalog;
		this.item = item;
		this.searchStrategy = searchStrategy;
	}
	
	@Override
	public void execute() {
		catalog.setSearchStrategy(searchStrategy);
		catalog.search(item);
	}
}
