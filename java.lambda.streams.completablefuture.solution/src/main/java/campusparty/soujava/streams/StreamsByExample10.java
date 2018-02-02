package campusparty.soujava.streams;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

// 1. Obtenha uma Set contendo todos os nomes de diretores (Movie::getDirector) usando
//    collect(Collector<Movie>). Não implemenete um Collector, mas use os métodos utilitários da
//    classe Collectors que geram coleções novas.
// 2. Imprima a quantidade de elementos do Set
public class StreamsByExample10 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		System.out.println("Total de filmes: " + movies.stream().count());

		Set<String> diretores = movies.stream()
									 .map(Movie::getDirector)
									 .collect(Collectors.toSet()); // 1
		System.out.println("Total de diretores: " + diretores.size()); // 2

	}

}
