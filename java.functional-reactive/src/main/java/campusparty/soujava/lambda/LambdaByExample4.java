package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

public class LambdaByExample4 {

	public static void main(String[] args) {
		Comando gritar = () -> System.out.println("AAAAA!");
		gritar.executar();

		Processador<String, Integer> processador = (data) -> data.length();
		System.out.println("Chars: " + processador.processar("Campus Party 2018"));
	}
}
