package campusparty.soujava;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

public class LambdaByExample3 {

	public static void main(String[] args) {
		Comando gritar = () -> {
			System.out.println("AAAAA!");
		};
		gritar.executar();

		Processador<String, Integer> processador = (String data) -> {
			return data.length();
		};
		System.out.println("Chars: " + processador.processar("Campus Party 2018"));
	}
}
