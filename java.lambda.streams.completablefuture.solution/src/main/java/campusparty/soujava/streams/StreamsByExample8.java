package campusparty.soujava.streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;

import campusparty.soujava.data.Movie;
import campusparty.soujava.data.Movies;

// 1. Use a operação terminal de redução count() para contar quantos filmes há no stream
// 2. Crie uma operação lambda de acumulação implementando um BinaryOperator<Integer>. A
//    operação recebe dois parâmetros (um acumulador e um operando) e deve somá-los.
// 3. Obtenha um stream e converta cada Movie na sua duração (getDuration)
// 4. Use uma operação terminal reduce(BinaryOperator<Integer>) para obter a soma dos resultados
//    (passe o lambda escrito no exercicio 2 como argumento)
// 5. A operação retorna um Optional<Integer> cujo resultado precisa ser extraído. Imprima o valor.
//    (usando reduce(0, acumulador) o valor é retornado diretamente)
// 6. Encontre o filme de menor duração (você pode escrever um reduce(), mas pesquise na documentação
//    e veja se já existe um método pronto)
public class StreamsByExample8 {

	public static void main(String[] args) {
		Collection<Movie> movies = Movies.getMovieList();
		
		System.out.println("Total: " + movies.stream().count()); // 1
		
		BinaryOperator<Integer> acumulador = (acum, oper) -> acum + oper; // 2
		
		Optional<Integer> result = movies.stream()
								  .map(Movie::getDuration) // 3
								  .reduce(acumulador); // 4 (isto tb poderia ser feito com sum())
		int soma = result.orElse(-1); // 5
		System.out.println("Duração total: " + soma); // 5
		
		System.out.println("Filme mais curto: " + movies.stream()
												       .map(Movie::getDuration)
												       .min(Comparator.comparing(n->n)) // 6*
												       .get()); // **
		
		// * Ok. A solução não foi tão trivial. O método min() requer um Comparator. Na classe
		// Comparator há um método comparing() que recebe uma Function com o mapeamento para
		// estabelecer o critério de ordenação; como são inteiros, usamos a identidade n->n
		
		// ** Optional possui vários métodos. get() retorna o valor se existir (ou null se não).


	}

}
