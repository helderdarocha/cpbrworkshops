package campusparty.soujava;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

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
