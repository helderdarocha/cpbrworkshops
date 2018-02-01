package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

public class LambdaByExample {
	
	static class GritarComando implements Comando {
		@Override
		public void executar() {
			System.out.println("AAAAA!");
		}
	}
	
	static class ContarCharsProcessador implements Processador<String, Integer> {
		@Override
		public Integer processar(String data) {
			return data.length();
		}
	}

	public static void main(String[] args) {
		Comando gritar = new GritarComando();
		gritar.executar();
		
		Processador<String, Integer> contar = new ContarCharsProcessador();
		int resultado = contar.processar("Campus Party 2018");
		System.out.println("Chars: " + resultado);
	}

}
