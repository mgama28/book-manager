package main;
import java.util.List;
import models.LibraryItem;
import catalog.Catalog;
import java.util.Scanner;
import strategies.SearchByTitle;
import strategies.SearchByCreator;
import strategies.SearchByGenre;
import strategies.SearchByYear;
import strategies.SearchByID;
import builder.BookBuilder;
import builder.MovieBuilder;
import builder.MusicBuilder;


public class Main {
	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		Scanner scanner = new Scanner(System.in);
		
		//Preload data test
		catalog.addItem(new BookBuilder().setId(1).setTitle("The Nightingale").setAuthor("Kristin Hannah").setGenre("Fiction").setYear(2015).setType("physical").setDuration(0).build());
		catalog.addItem(new BookBuilder().setId(2).setTitle("Dune").setAuthor("Frank Herbert").setGenre("Sci-Fi").setYear(1965).setType("ebook").setDuration(500).build());
		catalog.addItem(new MovieBuilder().setId(3).setTitle("Inception").setDirector("Nolan").setGenre("Sci-Fi").setYear(2010).setType("bluray").setDuration(148).build());
		
		boolean running = true;
		
		while (running) {
			System.out.println("1. Add a book");
			System.out.println("2. Add a Movie");
			System.out.println("3. Add Music");
			System.out.println("4. List all items");
			System.out.println("5. Search");
			System.out.println("6. Checkout Items");
			System.out.println("7. Return Item");
			System.out.println("8. Exit");
			System.out.println("Enter Choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter type (ebook/audiobook/physical): ");
				String type = scanner.nextLine();
				System.out.print("Enter id: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author's Name: ");
				String author = scanner.nextLine();
				System.out.print("Enter Genre: ");
				String genre = scanner.nextLine();
				System.out.print("Enter release year: ");
				int year = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter duration (if physical enter 0): ");
				int duration = scanner.nextInt();
				scanner.nextLine();

			    LibraryItem book = new BookBuilder()
			            .setType(type)
			            .setId(id)
			            .setTitle(title)
			            .setAuthor(author)
			            .setGenre(genre)
			            .setYear(year)
			            .setDuration(duration)
			            .build();
			        catalog.addItem(book);
				
				
				System.out.println("Book added successfully!");
				break;
			case 2:
				System.out.print("Enter type (bluray/digital/dvd): ");
				String type1 = scanner.nextLine();
				System.out.print("Enter id: ");
				int id1 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter title: ");
				String title1 = scanner.nextLine();
				System.out.print("Enter Director's Name: ");
				String director = scanner.nextLine();
				System.out.print("Enter Genre: ");
				String genre1 = scanner.nextLine();
				System.out.print("Enter release year: ");
				int year1 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter duration (if physical enter 0): ");
				int duration1 = scanner.nextInt();
				scanner.nextLine();

			    LibraryItem movie = new MovieBuilder()
			            .setType(type1)
			            .setId(id1)
			            .setTitle(title1)
			            .setDirector(director)
			            .setGenre(genre1)
			            .setYear(year1)
			            .setDuration(duration1)
			            .build();
			        catalog.addItem(movie);
				
				
				System.out.println("Movie added successfully!");
				break;
			case 3:
				System.out.print("Enter type (digital,cd,vinyl): ");
				String type2 = scanner.nextLine();
				System.out.print("Enter id: ");
				int id2 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter title: ");
				String title2 = scanner.nextLine();
				System.out.print("Enter Artist's Name: ");
				String artist = scanner.nextLine();
				System.out.print("Enter Genre: ");
				String genre2 = scanner.nextLine();
				System.out.print("Enter release year: ");
				int year2 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter duration (if physical enter 0): ");
				int duration2 = scanner.nextInt();
				scanner.nextLine();

			    LibraryItem music = new MusicBuilder()
			            .setType(type2)
			            .setId(id2)
			            .setTitle(title2)
			            .setArtist(artist)
			            .setGenre(genre2)
			            .setYear(year2)
			            .setDuration(duration2)
			            .build();
			        catalog.addItem(music);
				
				
				System.out.println("Music added successfully!");
				break;
				
			case 4:
				catalog.listAllItems();
			case 5:
				System.out.println("Search by: 1. Title 2. Creator 3. Genre 4. Year 5. ID");
				int searchChoice = scanner.nextInt();
				scanner.nextLine();
				
				switch(searchChoice) {
				case 1:
					catalog.setSearchStrategy(new SearchByTitle()); break;
				case 2:
					catalog.setSearchStrategy(new SearchByGenre()); break;
				case 3:
					catalog.setSearchStrategy(new SearchByCreator()); break;
				case 4:
					catalog.setSearchStrategy(new SearchByYear()); break;
				case 5:
					catalog.setSearchStrategy(new SearchByID()); break;
				}
				
				System.out.print("Enter search term: ");
				String search = scanner.nextLine();
				List<LibraryItem> results = catalog.search(search);
				
				if(results.isEmpty()) {
					System.out.println("No items found!");
				} else {
					for(LibraryItem result : results) {
						result.print();
					}
				}
				break;
			case 6:
			    System.out.print("Enter item ID to checkout: ");
			    int checkoutId = scanner.nextInt();
			    scanner.nextLine();
			    
			    catalog.setSearchStrategy(new SearchByID());
			    List<LibraryItem> checkoutResults = catalog.search(String.valueOf(checkoutId));
			    
			    if (checkoutResults.isEmpty()) {
			        System.out.println("Item not found!");
			    } else {
			        checkoutResults.get(0).checkOut();
			        System.out.println("Item checked out successfully!");
			    }
			    break;
			case 7:
			    System.out.print("Enter item ID to return: ");
			    int returnId = scanner.nextInt();
			    scanner.nextLine();
			    
			    catalog.setSearchStrategy(new SearchByID());
			    
			    List<LibraryItem> returnResults = catalog.search(String.valueOf(returnId));
			    
			    if (returnResults.isEmpty()) {
			        System.out.println("Item not found!");
			    } else {
			    	if (returnResults.get(0).isAvailable()) {
			    	    System.out.println("Item is already available, cannot return!");
			    	} else {
			    	    returnResults.get(0).returnItem();
			    	    System.out.println("Item returned successfully!");
			    	}
			    }
			    break;
			case 8:
				running = false;
				break;
			}
		}
		scanner.close();
	}
}
