package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

public class LambdaByExample2 {

	public static void main(String[] args) {
		Comando gritar = new Comando() {
			@Override
			public void executar() {
				System.out.println("AAAAA!");
			}
		};
		gritar.executar();
		
		Processador<String, Integer> processador = new Processador<String, Integer>() {
			@Override
			public Integer processar(String data) {
				return data.length();
			}
		};
		System.out.println("Chars: " + processador.processar("Campus Party 2018"));
	}

}
