package campusparty.soujava.streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

public class StreamsByExample8 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		System.out.println("Total: " + movies.stream().count());
		
		BinaryOperator<Integer> acumulador = (acum, oper) -> acum + oper;
		
		Optional<Integer> result = movies.stream()
								  .map(Movie::getDuration)
								  .reduce(acumulador);
		int soma = result.orElse(-1);
		System.out.println("Duração total: " + soma);
		
		System.out.println("Filme mais curto: " + movies.stream()
												       .map(Movie::getDuration)
												       .min(Comparator.comparing(n->n))
												       .get());


	}

}
