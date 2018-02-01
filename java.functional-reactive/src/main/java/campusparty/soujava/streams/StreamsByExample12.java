package campusparty.soujava.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample12 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();

		System.out.println("Total de filmes: " + movies.stream().count());

		Set<String> diretores = movies.stream().map(Movie::getDirector).collect(Collectors.toSet());
		System.out.println("Total de diretores: " + diretores.size());

		Map<String, List<Movie>> directors = 
				movies.stream()
					  .collect(Collectors.groupingBy(Movie::getDirector));

		
	}

}
