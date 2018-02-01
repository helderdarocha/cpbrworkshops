package campusparty.soujava.streams;

import java.util.Collection;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		for(Movie m : movies)
			System.out.println(m);

	}

}
