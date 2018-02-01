package campusparty.soujava.streams;

import java.util.Collection;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

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
