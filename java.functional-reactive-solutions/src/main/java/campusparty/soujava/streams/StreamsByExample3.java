package campusparty.soujava.streams;

import java.util.Collection;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample3 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		for(Movie m : movies)
			if(m.getDuration() <= 100)
				System.out.println(m);

	}

}
