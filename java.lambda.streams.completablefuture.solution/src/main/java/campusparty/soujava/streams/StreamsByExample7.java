package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

//1. Substitua as expressões lambda por referências de métodos onde for possível (os parâmetros
//   serão obtidos por inferência se possível)
public class StreamsByExample7 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		movies.stream()
	      .filter(m -> m.getDuration() <= 100)
	      .map(Movie::getTitle) // 1 
	      .forEach(System.out::println); // 1 

	}

}
