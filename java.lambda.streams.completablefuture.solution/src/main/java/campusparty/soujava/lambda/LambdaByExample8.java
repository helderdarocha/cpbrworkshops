package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

// 8. LAMBDA: mantendo dados fixos e variando o comportamento
// 8.1. Chame os métodos variando as expressões lambda passadas: assim é possível alterar
//      o comportamento sem modificar os dados e obter resultados distintos (esta é
//      a essência do estilo funcional em Java)
public class LambdaByExample8 {
	
	public static int medir(Processador<String,Integer> processador, String texto) {
		return processador.processar(texto);
	}
	
	public static String transformar(Processador<String,String> processador, String texto) {
		return processador.processar(texto);
	}
	
	public static void fazer(Comando comando) {
		comando.executar();
	}

	public static void main(String[] args) {
		fazer(() -> System.out.println("AAAAA!")); // 1
		fazer(() -> new Thread(()->System.out.println("BBBBB!")).start()); // 1*
		
		// * Observe que o Thread acima recebe uma expressão idêntica, mas na verdade é uma 
		// implementação de Runnable (descoberta por inferencia). Mas, do ponto de vista da
		// programação funcional são expressões que fazem a mesma coisa e o tipo da interface
		// é irrelevante.
		
		System.out.println("Chars: " + medir(data -> data.length(), "Campus Party 2018")); // 1
		System.out.println("Words: " + medir(data -> data.split("\\W").length, "Campus Party 2018"));  // 1
		System.out.println( 
				transformar(data -> data.replace(' ','*'), // 1
						transformar(data -> data.toUpperCase(), "Campus Party 2018") // 1
				)
		);
	}
}
