package campusparty.soujava.lambda;

import java.util.function.Function;

// 10. LAMBDA: Referências de métodos e construtores
// 10.1. Troque expressões lambda por referências de métodos onde for possível.
public class LambdaByExample10 {
	
	public static int medir(Function<String,Integer> processador, String texto) {
		return processador.apply(texto);
	}
	
	public static String transformar(Function<String,String> processador, String texto) {
		return processador.apply(texto);
	}
	
	public static void fazer(Runnable comando) {
		comando.run();
	}

	public static void main(String[] args) {
		fazer(() -> System.out.println("AAAAA!"));
		fazer(() -> new Thread(()->System.out.println("BBBBB!")).start());
		
		System.out.println("Chars: " + medir(String::length, "Campus Party 2018")); // 1
		System.out.println("Words: " + medir(data -> data.split("\\W").length, "Campus Party 2018"));
		System.out.println(
				transformar(data -> data.replace(' ','*'), 
						transformar(String::toUpperCase, "Campus Party 2018") // 1
				)
		);
	}
}
