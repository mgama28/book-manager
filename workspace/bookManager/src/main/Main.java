package main;

import models.LibraryItem;
import catalog.Catalog;
import java.util.Scanner;
import factory.BookFactory;
import strategies.SearchByTitle;
import strategies.SearchByCreator;
import strategies.SearchByGenre;
import strategies.SearchByYear;


public class Main {
	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		Scanner scanner = new Scanner(System.in);
		BookFactory bookFactory = new BookFactory();
		
		boolean running = true;
		
		while (running) {
			System.out.println("1. Add a book");
			System.out.println("2. List all books");
			System.out.println("3. Search for book");
			System.out.println("4. Exit");
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
				System.out.print("Enter duration (0 for physical): ");
				int duration = scanner.nextInt();
				scanner.nextLine();
				LibraryItem book = bookFactory.createItem(type, id, title, author, genre, year, duration);
				catalog.addItem(book);
				System.out.println("Book added successfully!");
				break;
			case 2:
				catalog.listAllItems();
				break;
			case 3:
				System.out.println("Search by: 1. Title 2. Creator 3. Genre 4. Year");
				int searchChoice = scanner.nextInt();
				scanner.nextLine();
				
				switch(searchChoice) {
				case 1: catalog.setSearchStrategy(new SearchByTitle()); break;
				case 2: catalog.setSearchStrategy(new SearchByCreator()); break;
				case 3: catalog.setSearchStrategy(new SearchByGenre()); break;
				case 4: catalog.setSearchStrategy(new SearchByYear()); break;
				}
				
				System.out.print("Enter Search term: ");
				String search = scanner.nextLine();
				
				break;
			case 4:
				running = false;
				break;
			}
		}
		scanner.close();
	}
}
