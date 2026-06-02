package builder;
import models.LibraryItem;
import factory.LibraryFactory;
import interfaces.IBookFactory;


public class BookBuilder {
	
	private int id;
	private String title;
	private String author;
	private String genre;
	private int year;
	private int duration;
	private String type;
	
	public BookBuilder setId(int id) {
		this.id = id;
		return this;
	}
	
	public BookBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}
	
	public BookBuilder setGenre(String genre) {
		this.genre = genre;
		return this;
	}
	
	public BookBuilder setYear(int year) {
		this.year = year;
		return this;
	}
	
	public BookBuilder setDuration(int duration) {
		this.duration = duration;
		return this;
	}
	
	public BookBuilder setType(String type) {
		this.type = type;
		return this;
	}
	
	public LibraryItem build() {
		IBookFactory factory = new LibraryFactory().getBookFactory();
		switch(type) {
		case "ebook": return factory.createEBook(id, title, author, genre, year, duration);
		case "audiobook": return factory.createAudioBook(id, title, author, genre, year, duration);
		case "physical": return factory.createPhysicalBook(id, title, author, genre, year);
		default: return null;
		}
	}
	
	
	
}
