package campusparty.soujava.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample13 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();

		System.out.println("Total de filmes: " + movies.stream().count());

		Set<String> diretores = movies.stream().map(Movie::getDirector).collect(Collectors.toSet());
		System.out.println("Total de diretores: " + diretores.size());

		Map<String, List<Movie>> directorsWithMovies = 
				movies.stream()
					  .collect(Collectors.groupingBy(Movie::getDirector));

		List<Stream<Movie>> kubrickOrAlmodovarTitles = 
				directorsWithMovies.entrySet().stream()
					.filter(m -> m.getKey().indexOf("Almodovar") >=0 ||
					             m.getKey().indexOf("Kubrick") >=0)
					.map(m -> m.getValue().stream())
					.collect(Collectors.toList());
		kubrickOrAlmodovarTitles.get(0).map(Movie::getTitle).forEach(System.out::println);
		kubrickOrAlmodovarTitles.get(1).map(Movie::getTitle).forEach(System.out::println);
	}

}
