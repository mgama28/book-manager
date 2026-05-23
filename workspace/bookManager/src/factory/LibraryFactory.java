package factory;
import interfaces.IFactory;
import interfaces.IBookFactory;
import interfaces.IMovieFactory;
import interfaces.IMusicFactory;

public class LibraryFactory implements IFactory {
	
	@Override
	public IBookFactory getBookFactory() {
		return new BookFactory();
	}
	
	@Override
	public IMusicFactory getMusicFactory() {
		return new MusicFactory();
	}
	
	@Override
	public IMovieFactory getMovieFactory() {
		return new MovieFactory();
	}
	
}
