package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

//2. IMPLEMENTAÇÂO COM CLASSES ANONIMAS (Java 1.1)
//2.1. Implemente as interfaces funcionais como classes anônimas no local onde são instanciadas
//2.2. Chame os métodos diretamente (sem criar uma referencia)
public class LambdaByExample1 {

	public static void main(String[] args) {
		new Comando() { // 1
			@Override
			public void executar() {
				System.out.println("AAAAA!");
			}
		}.executar(); // 2
		
		System.out.println("Chars: " + new Processador<String, Integer>() { // 1
			@Override
			public Integer processar(String data) {
				return data.length();
			}
		}.processar("Campus Party 2018")); // 2
	}

}
