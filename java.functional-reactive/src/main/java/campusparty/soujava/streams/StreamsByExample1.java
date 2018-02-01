package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Stream;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample1 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		Consumer<Movie> action = m -> System.out.println(m);
		
		Stream<Movie> stream = movies.stream();
		
		stream.forEach(action);
		
		//stream.forEach(action); // erro: stream ja foi consumido
			
	}

}
