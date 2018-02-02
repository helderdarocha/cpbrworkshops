package campusparty.soujava.lambda;

import java.util.function.Function;

// 9. LAMBDA
// 9.1 Troque as interfaces funcionais declaradas nos métodos por interfaces da API padrão 
//     do pacote java.util.function e interface java.lang.Runnable (o código principal não muda)
public class LambdaByExample9 {
	
	public static int medir(Function<String,Integer> processador, String texto) { // 1
		return processador.apply(texto);
	}
	
	public static String transformar(Function<String,String> processador, String texto) { // 1
		return processador.apply(texto);
	}
	
	public static void fazer(Runnable comando) {  // 1
		comando.run();
	}

	public static void main(String[] args) {
		fazer(() -> System.out.println("AAAAA!")); 
		fazer(() -> new Thread(()->System.out.println("BBBBB!")).start()); 
		
		System.out.println("Chars: " + medir(data -> data.length(), "Campus Party 2018"));
		System.out.println("Words: " + medir(data -> data.split("\\W").length, "Campus Party 2018"));
		System.out.println(
				transformar(data -> data.replace(' ','*'), 
						transformar(data -> data.toUpperCase(), "Campus Party 2018")
				)
		);
	}
}
