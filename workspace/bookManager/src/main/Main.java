package main;

import models.Book;
import catalog.Catalog;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		Scanner scanner = new Scanner(System.in);
		
		boolean running = true;
		
		while (running) {
			System.out.println("1. Add a book");
			System.out.println("2. List all books");
			System.out.println("3. Search for book");
			System.out.println("4. Exit");
			System.out.println("Enter Choice: ");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter id: ");
				int id = scanner.nextInt();
				System.out.print("Enter title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author's Name: ");
				String author = scanner.nextLine();
				System.out.print("Enter Genre: ");
				String genre = scanner.nextLine();
				System.out.print("Enter release year: ");
				int year = scanner.nextInt();
				Book book = new Book(id, title, author, genre, year);
				catalog.addItem(book);
				System.out.println("Book added successfully!");
				break;
			case 2:
				catalog.listAllItems();
				break;
			case 3:
				catalog.searchByTitle(null);
				break;
			case 4:
				running = false;
				break;
			}
		}
	}
}
