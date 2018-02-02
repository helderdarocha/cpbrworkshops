package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

//1. Converta para lambda: use uma operação intermediária filter(Predicate<Movie>)
//   para listar os filmes com duração menor ou igual a 100 minutos
//2. Experimente imprimir um texto dentro de filter() e remova forEach(). Veja que a
//   operação não acontece, porque filter() é uma operação lazy, intermediária, que
//   só ocorre se no final do stream houver uma operação eager, terminal, que puxa (pulls)
//   os dados do stream.

public class StreamsByExample4 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		movies.stream()
		      .filter(m -> m.getDuration() <= 100) // 1
		      .forEach(m -> System.out.println(m));

		// 2 Lazy example
		   /*
		movies.stream()
	      .filter(m -> { // lazy - só executa quando ocorrer o "pull"
	    	     System.out.println(m);
	    	     return m.getDuration() <= 100;
	      })
	     ;// .forEach(m -> {}); // necessário para fazer o "pull"
			*/
	}

}
