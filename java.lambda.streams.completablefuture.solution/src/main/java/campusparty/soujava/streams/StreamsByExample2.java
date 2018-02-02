package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

// 1. Use uma única instrução com métodos encadeados desde a obtenção do stream até o forEach.
public class StreamsByExample2 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		movies.stream().forEach(m -> System.out.println(m)); // 1
			
	}

}
