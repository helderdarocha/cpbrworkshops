package campusparty.soujava;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

public class LambdaByExample1 {

	public static void main(String[] args) {
		new Comando() {
			@Override
			public void executar() {
				System.out.println("AAAAA!");
			}
		}.executar();
		
		System.out.println("Chars: " + new Processador<String, Integer>() {
			@Override
			public Integer processar(String data) {
				return data.length();
			}
		}.processar("Campus Party 2018"));
	}

}
