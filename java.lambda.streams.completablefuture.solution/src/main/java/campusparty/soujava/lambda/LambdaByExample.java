package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

// 1. IMPLEMENTAÇÂO SEM LAMBDA (Java 1)
// 1.1. Implemente duas interfaces funcionais criadas no pacote function deste projeto como classes estáticas
// 1.2. Instancie objetos de cada classe
// 1.3. Chame os métodos e execute
public class LambdaByExample {

	static class GritarComando implements Comando { // 1
		@Override
		public void executar() {
			System.out.println("AAAAA!");
		}
	}
	
	static class ContarCharsProcessador implements Processador<String, Integer> { // 1
		@Override
		public Integer processar(String data) {
			return data.length();
		}
	}

	public static void main(String[] args) {
		Comando gritar = new GritarComando(); // 2
		gritar.executar(); // 3
		
		Processador<String, Integer> contar = new ContarCharsProcessador(); // 2
		int resultado = contar.processar("Campus Party 2018"); // 3
		System.out.println("Chars: " + resultado);
	}

}
