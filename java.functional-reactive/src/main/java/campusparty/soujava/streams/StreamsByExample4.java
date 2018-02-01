package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample4 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		movies.stream()
		      .filter(m -> m.getDuration() <= 100)
		      .forEach(m -> System.out.println(m));

		// Lazy example
		/*
		movies.stream()
	      .filter(m -> {
	    	     System.out.println(m);
	    	     return m.getDuration() <= 100;
	      })
	     ;// .forEach(m -> {});
			*/
	}

}
