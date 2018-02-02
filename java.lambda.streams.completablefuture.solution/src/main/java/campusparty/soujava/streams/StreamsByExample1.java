package campusparty.soujava.streams;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Stream;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

//1. Implemente uma expressão lambda (de Consumer<Movie>) que imprima o objeto (System.out.println)
//2. Obtenha um stream para a Collection<Movie>.
//3. Chame a operação terminal forEach(Consumer<T>) passando a expressão lambda criada como argumento
//4. Tente chamar forEach() novamente no mesmo stream e veja o que acontece
public class StreamsByExample1 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		Consumer<Movie> action = m -> System.out.println(m); // 1
		
		Stream<Movie> stream = movies.stream(); // 2
		
		stream.forEach(action); // 3
		
		//stream.forEach(action); // 4 (stream ja consumido)
			
	}

}
