package campusparty.soujava;

import java.util.function.Function;

public class LambdaByExample9 {
	
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
		
		System.out.println("Chars: " + medir(data -> data.length(), "Campus Party 2018"));
		System.out.println("Words: " + medir(data -> data.split("\\W").length, "Campus Party 2018"));
		System.out.println(
				transformar(data -> data.replace(' ','*'), 
						transformar(data -> data.toUpperCase(), "Campus Party 2018")
				)
		);
	}
}
