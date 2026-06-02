package main;

import models.LibraryItem;
import catalog.Catalog;
import java.util.Scanner;
import strategies.SearchByTitle;
import strategies.SearchByCreator;
import strategies.SearchByGenre;
import strategies.SearchByYear;
import builder.BookBuilder;
import builder.MovieBuilder;
import builder.MusicBuilder;


public class Main {
	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		Scanner scanner = new Scanner(System.in);
		
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
				running = false;
				break;
			}
		}
		scanner.close();
	}
}
