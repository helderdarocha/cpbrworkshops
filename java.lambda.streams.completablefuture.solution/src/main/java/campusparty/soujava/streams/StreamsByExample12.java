package campusparty.soujava.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

// 1. Use o mapa de diretores para obter uma lista de títulos de filmes de Almodovar ou Kubrick. Primeiro crie uma List<Stream<Movie>>
// a. Obtenha um stream do entrySet()
// b. Filtre o key de cada entry e compare: indexOf("Almodovar") >=0 || indexOf("Kubrick") >=0
// c. Mapeie cada resultado ao valor (que é uma Collection, portanto obtenha o stream também): getValue().stream()
// d. Colecione tudo em uma List. O resultado será uma List<Stream<Movie>>.
// e. Agora precisamos tirar o Stream de dentro da List. O próximo exercício mostra como fazer isto. Por enquanto, 
//    use os métodos de List (get(indice)) e imprima a lista de títulos
public class StreamsByExample12 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();

		System.out.println("Total de filmes: " + movies.stream().count());

		Set<String> diretores = movies.stream().map(Movie::getDirector).collect(Collectors.toSet());
		System.out.println("Total de diretores: " + diretores.size());

		Map<String, List<Movie>> directorsWithMovies = 
				movies.stream()
					  .collect(Collectors.groupingBy(Movie::getDirector));

		List<Stream<Movie>> kubrickOrAlmodovarTitles = 
				directorsWithMovies.entrySet().stream() // 1.a.
					.filter(m -> m.getKey().indexOf("Almodovar") >=0 ||
					             m.getKey().indexOf("Kubrick") >=0) // 1.b.
					.map(m -> m.getValue().stream())  // 1.c.
					.collect(Collectors.toList()); // 1.d.
		kubrickOrAlmodovarTitles.get(0)
		    .map(Movie::getTitle)
		    .forEach(System.out::println); // 1.e.
		kubrickOrAlmodovarTitles.get(1)
		    .map(Movie::getTitle)
		    .forEach(System.out::println); // 1.e.
	}

}
