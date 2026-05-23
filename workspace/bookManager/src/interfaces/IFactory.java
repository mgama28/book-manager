package interfaces;

public interface IFactory {
	
	IBookFactory getBookFactory();
	
	IMusicFactory getMusicFactory();
	
	IMovieFactory getMovieFactory();
}
