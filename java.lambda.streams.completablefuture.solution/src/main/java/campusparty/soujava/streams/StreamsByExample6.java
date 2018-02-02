package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

//1. Converta para lambda. Use map(Function<Movie,String>) para converter um Movie em uma String.
public class StreamsByExample6 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		movies.stream()
	      .filter(m -> m.getDuration() <= 100)
	      .map(m -> m.getTitle()) // 1
	      .forEach(m -> System.out.println(m));

	}

}
