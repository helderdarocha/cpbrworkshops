package campusparty.soujava.streams;

import java.util.Collection;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

// 1. Converta para lambda. Use map(Function<Movie,String>) para converter um Movie em uma String.
public class StreamsByExample5 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		for(Movie m : movies) {
			if(m.getDuration() <= 100) {
				String titulo = m.getTitle();
				System.out.println(titulo); // mesma instrução, novos dados
			}
		}
	}

}
