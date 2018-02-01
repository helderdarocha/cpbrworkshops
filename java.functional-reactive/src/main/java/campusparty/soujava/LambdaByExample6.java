package campusparty.soujava;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

public class LambdaByExample6 {
	
	public static int medir(Processador<String,Integer> processador, String texto) {
		return processador.processar(texto);
	}
	
	public static void fazer(Comando comando) {
		comando.executar();
	}
	
	public static String transformar(Processador<String,String> processador, String texto) {
		return processador.processar(texto);
	}

	public static void main(String[] args) {
		Comando gritar = () -> System.out.println("AAAAA!");
		fazer(gritar);

		Processador<String, Integer> comprimento = data -> data.length();
		System.out.println("Chars: " + medir(comprimento, "Campus Party 2018"));
		
		Processador<String, String> caixaAlta = data -> data.toUpperCase();
		System.out.println("Chars: " + transformar(caixaAlta, "Campus Party 2018"));
	}
}
