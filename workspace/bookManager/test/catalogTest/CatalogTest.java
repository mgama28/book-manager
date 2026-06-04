package catalogTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import catalog.Catalog;
import models.LibraryItem;
import builder.BookBuilder;
import strategies.SearchByTitle;
import java.util.List;

public class CatalogTest {
	
	private Catalog testCatalog;
	private LibraryItem book1;
	private LibraryItem book2;
	private LibraryItem book3;
	private LibraryItem book4;
	private LibraryItem book5;
	private LibraryItem book6;
	
	@Before
	public void setUp() {
		testCatalog = new Catalog();
		book1 = new BookBuilder().setType("physical").setId(1234).setTitle("Smile").setAuthor("Raina Telegmeier").setGenre("Graphic Novel").setYear(2010).setDuration(0).build();
		book2 = new BookBuilder().setType("ebook").setId(0111).setTitle("Smile").setAuthor("Raina Telegmeier").setGenre("Graphic Novel").setYear(2010).setDuration(160).build();
		book3 = new BookBuilder().setType("physical").setId(1235).setTitle("A Court of Thorns And Roses").setAuthor("Sarah J Maas").setGenre("Romance").setYear(2010).setDuration(0).build();
		book4 = new BookBuilder().setType("audiobook").setId(2001).setTitle("Fourth Wing").setAuthor("Rebecca Yarros").setGenre("Fantasy").setYear(2020).setDuration(450).build();
		book5 = new BookBuilder().setType("physical").setId(1236).setTitle("Drama").setAuthor("Raina Telegmeier").setGenre("Graphic Novel").setYear(2014).setDuration(0).build();
		book6 = new BookBuilder().setType("audiobook").setId(1234).setTitle("Smile").setAuthor("Raina Telegmeier").setGenre("Graphic Novel").setYear(2010).setDuration(0).build();
		
	}
	
	@Test
	public void testAddItem() {
		
		 testCatalog.addItem(book1);
		 testCatalog.addItem(book2);
		 testCatalog.addItem(book3);
		 testCatalog.addItem(book4);
		 testCatalog.addItem(book5);
		 
		        
		assertEquals(5, testCatalog.getCatalogSize());
		
		
	}
	
	@Test
	public void testDuplicateItem() {
		
		testCatalog.addItem(book1);
		testCatalog.addItem(book6);
		
		assertEquals(1, testCatalog.getCatalogSize());
		
	}
	
	@Test
	public void testSearchByTitle() {
		
		 testCatalog.addItem(book1);
		 testCatalog.addItem(book2);
		 testCatalog.addItem(book3);
		 testCatalog.addItem(book4);
		 testCatalog.addItem(book5);
		 
		 
		 testCatalog.setSearchStrategy(new SearchByTitle());
		 
		 List<LibraryItem> results = testCatalog.search("Smile");
		 int resultNum = results.size();
		 
		 assertEquals(2, resultNum);
	}
	
	@Test
	public void testRemoveItem() {
		testCatalog.addItem(book1);
		testCatalog.removeItem(book1.getId());
		
		assertEquals(0, testCatalog.getCatalogSize());
	}

}
