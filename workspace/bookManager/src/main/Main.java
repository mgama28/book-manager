package main;
import java.util.List;
import java.util.ArrayList;
import models.LibraryItem;
import models.Member;
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
		List<Member> members = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		//Pre-load data test ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Books:
		catalog.addItem(new BookBuilder().setId(1).setTitle("The Way of Kings").setAuthor("Brandon Sanderson").setGenre("Fantasy").setYear(2010).setType("physical").setDuration(0).build());
		catalog.addItem(new BookBuilder().setId(2).setTitle("Mistborn").setAuthor("Brandon Sanderson").setGenre("Fantasy").setYear(2006).setType("ebook").setDuration(600).build());
		catalog.addItem(new BookBuilder().setId(3).setTitle("Words of Radiance").setAuthor("Brandon Sanderson").setGenre("Fantasy").setYear(2014).setType("audiobook").setDuration(1400).build());
		catalog.addItem(new BookBuilder().setId(4).setTitle("A Court of Thorns and Roses").setAuthor("Sarah J. Maas").setGenre("Fantasy").setYear(2015).setType("physical").setDuration(0).build());
		catalog.addItem(new BookBuilder().setId(5).setTitle("Throne of Glass").setAuthor("Sarah J. Maas").setGenre("Fantasy").setYear(2012).setType("ebook").setDuration(500).build());
		catalog.addItem(new BookBuilder().setId(6).setTitle("The Nightingale").setAuthor("Kristin Hannah").setGenre("Historical Fiction").setYear(2015).setType("physical").setDuration(0).build());
		catalog.addItem(new BookBuilder().setId(7).setTitle("Firefly Lane").setAuthor("Kristin Hannah").setGenre("Fiction").setYear(2008).setType("audiobook").setDuration(720).build());
		
		//Movies: 
		catalog.addItem(new MovieBuilder().setId(8).setTitle("The Devil Wears Prada").setDirector("David Frankel").setGenre("Comedy").setYear(2006).setType("bluray").setDuration(109).build());
		catalog.addItem(new MovieBuilder().setId(9).setTitle("Les Misérables").setDirector("Tom Hooper").setGenre("Drama").setYear(2012).setType("dvd").setDuration(158).build());
		catalog.addItem(new MovieBuilder().setId(10).setTitle("The Princess Diaries").setDirector("Garry Marshall").setGenre("Comedy").setYear(2001).setType("digital").setDuration(115).build());
		catalog.addItem(new MovieBuilder().setId(16).setTitle("How to Lose a Guy in 10 Days").setDirector("Donald Petrie").setGenre("Rom-Com").setYear(2003).setType("dvd").setDuration(116).build());
		catalog.addItem(new MovieBuilder().setId(17).setTitle("13 Going on 30").setDirector("Gary Winick").setGenre("Rom-Com").setYear(2004).setType("dvd").setDuration(98).build());
		catalog.addItem(new MovieBuilder().setId(18).setTitle("Legally Blonde").setDirector("Robert Luketic").setGenre("Rom-Com").setYear(2001).setType("bluray").setDuration(96).build());
		catalog.addItem(new MovieBuilder().setId(20).setTitle("Maid in Manhattan").setDirector("Wayne Wang").setGenre("Rom-Com").setYear(2002).setType("digital").setDuration(105).build());
		catalog.addItem(new MovieBuilder().setId(21).setTitle("The Proposal").setDirector("Anne Fletcher").setGenre("Rom-Com").setYear(2009).setType("bluray").setDuration(108).build());
		catalog.addItem(new MovieBuilder().setId(22).setTitle("27 Dresses").setDirector("Anne Fletcher").setGenre("Rom-Com").setYear(2008).setType("dvd").setDuration(111).build());
		
		//Music:
		catalog.addItem(new MusicBuilder().setId(24).setTitle("Nadie Sabe Lo Que Va a Pasar Mañana").setArtist("Bad Bunny").setGenre("Reggaeton").setYear(2023).setType("digital").setDuration(52).build());
		catalog.addItem(new MusicBuilder().setId(14).setTitle("Un Verano Sin Ti").setArtist("Bad Bunny").setGenre("Reggaeton").setYear(2022).setType("digital").setDuration(81).build());
		catalog.addItem(new MusicBuilder().setId(15).setTitle("YHLQMDLG").setArtist("Bad Bunny").setGenre("Reggaeton").setYear(2020).setType("cd").setDuration(42).build());
		catalog.addItem(new MusicBuilder().setId(25).setTitle("21").setArtist("Adele").setGenre("Pop/Soul").setYear(2011).setType("cd").setDuration(48).build());
		catalog.addItem(new MusicBuilder().setId(26).setTitle("25").setArtist("Adele").setGenre("Pop/Soul").setYear(2015).setType("vinyl").setDuration(48).build());
		catalog.addItem(new MusicBuilder().setId(27).setTitle("30").setArtist("Adele").setGenre("Pop/Soul").setYear(2021).setType("cd").setDuration(58).build());
		catalog.addItem(new MusicBuilder().setId(28).setTitle("Isolation").setArtist("Kali Uchis").setGenre("R&B").setYear(2018).setType("vinyl").setDuration(41).build());
		catalog.addItem(new MusicBuilder().setId(29).setTitle("Sin Miedo").setArtist("Kali Uchis").setGenre("R&B").setYear(2020).setType("digital").setDuration(39).build());
		catalog.addItem(new MusicBuilder().setId(30).setTitle("Orquideas").setArtist("Kali Uchis").setGenre("R&B").setYear(2024).setType("cd").setDuration(43).build());
		catalog.addItem(new MusicBuilder().setId(31).setTitle("Goodbye Yellow Brick Road").setArtist("Elton John").setGenre("Rock").setYear(1973).setType("vinyl").setDuration(76).build());
		catalog.addItem(new MusicBuilder().setId(32).setTitle("Madman Across the Water").setArtist("Elton John").setGenre("Rock").setYear(1971).setType("cd").setDuration(47).build());
		catalog.addItem(new MusicBuilder().setId(33).setTitle("Honky Chateau").setArtist("Elton John").setGenre("Rock").setYear(1972).setType("vinyl").setDuration(42).build());
		
		//Members
		members.add(new Member(1, "Alice", "Smith", "alice@email.com", "2003-08-12"));
		members.add(new Member(2, "Bob", "Johnson", "bob@email.com", "1985-05-15"));
		members.add(new Member(3, "Maria", "Garcia", "maria@email.com", "1995-03-20"));
		
		// End of Pre-load data test ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
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
				System.out.println("Select member:");
				for (Member m : members) {
				    System.out.println(m.getMemberId() + ". " + m.getMemberName());
				}
				int memberChoice = scanner.nextInt();
				scanner.nextLine();
				Member selectedMember = members.get(memberChoice - 1);
				
			    System.out.print("Enter item ID to checkout: ");
			    int checkoutId = scanner.nextInt();
			    scanner.nextLine();
			    
			    catalog.setSearchStrategy(new SearchByID());
			    List<LibraryItem> checkoutResults = catalog.search(String.valueOf(checkoutId));
			    
			    if (checkoutResults.isEmpty()) {
			        System.out.println("Item not found!");
			    } else {
			    	LibraryItem itemToCheckout = checkoutResults.get(0);
			        if (itemToCheckout.isAvailable()) {
			            itemToCheckout.checkOut();
			            selectedMember.getCheckedOutItems().add(itemToCheckout);
			            System.out.println(selectedMember.getMemberName() + " checked out " + itemToCheckout.getTitle() + " successfully!");
			        } else {
			            System.out.println("Sorry, " + itemToCheckout.getTitle() + " is not available!");
			        }
			    }
			    break;
			case 7:
			    System.out.println("Select member:");
			    for (Member m : members) {
			        System.out.println(m.getMemberId() + ". " + m.getMemberName());
			    }
			    int returnMemberChoice = scanner.nextInt();
			    scanner.nextLine();
			    Member returningMember = members.get(returnMemberChoice - 1);
			    
			    if (returningMember.getCheckedOutItems().isEmpty()) {
			        System.out.println("No items checked out!");
			    } else {
			        System.out.println("Checked out items:");
			        for (LibraryItem i : returningMember.getCheckedOutItems()) {
			            System.out.println(i.getId() + ". " + i.getTitle());
			        }
			        System.out.print("Enter item ID to return: ");
			        int returnId = scanner.nextInt();
			        scanner.nextLine();
			        catalog.setSearchStrategy(new SearchByID());
			        List<LibraryItem> returnResults = catalog.search(String.valueOf(returnId));
			        if (!returnResults.isEmpty()) {
			            returnResults.get(0).returnItem();
			            returningMember.getCheckedOutItems().remove(returnResults.get(0));
			            System.out.println(returningMember.getMemberName() + " returned " + returnResults.get(0).getTitle() + " successfully!");
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
