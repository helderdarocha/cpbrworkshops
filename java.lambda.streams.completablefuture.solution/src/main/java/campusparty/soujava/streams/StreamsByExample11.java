package campusparty.soujava.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

// 1. Crie um mapa de diretores, contendo a lista de seus filmes, ou seja, um Map<String, List<Movie>>.
//    Para fazer isto obtenha um stream() de Movie e use collect() com um Collector downstream de
//    agrupamento: Collectors.groupingBy(Function<Movie, String>)
public class StreamsByExample11 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();

		System.out.println("Total de filmes: " + movies.stream().count());

		Set<String> diretores = movies.stream().map(Movie::getDirector).collect(Collectors.toSet());
		System.out.println("Total de diretores: " + diretores.size());

		Map<String, List<Movie>> directors = 
				movies.stream()
					  .collect(Collectors.groupingBy(Movie::getDirector)); // 1

		
	}

}
