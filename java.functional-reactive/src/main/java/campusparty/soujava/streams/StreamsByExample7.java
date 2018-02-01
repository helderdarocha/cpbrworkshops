package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample7 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		movies.stream()
	      .filter(m -> m.getDuration() <= 100)
	      .map(Movie::getTitle)
	      .forEach(System.out::println);

	}

}
