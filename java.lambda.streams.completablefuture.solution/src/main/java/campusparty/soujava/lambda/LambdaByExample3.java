package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

//3. IMPLEMENTAÇÂO COM LAMBDA (Java 8)
//3.1. Substitua as classes anônimas por expressões lambda: remova tudo antes dos parâmetros
//     do método, e tudo depois do corpo do método, e separe parâmetros e corpo com "->"
//3.2. Atribua a expressão lambda resultante à interface funcional correspondente
//     (necessário para que seja possível inferir os tipos)
//3.3. Chame os métodos e execute
public class LambdaByExample3 {

	public static void main(String[] args) {
		Comando gritar = () -> { // 1 & 2
			System.out.println("AAAAA!");
		};
		gritar.executar(); // 3

		Processador<String, Integer> processador = // 2
		(String data) -> { // 1
			return data.length();
		};
		System.out.println("Chars: " + processador.processar("Campus Party 2018")); // 3
	}
}
