package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

//5. LAMBDA: simplificação
//5.1. Se houver apenas um parâmetro, pode-se remover os parênteses
public class LambdaByExample5 {

	public static void main(String[] args) {
		Comando gritar = () -> System.out.println("AAAAA!");
		gritar.executar();

		Processador<String, Integer> processador = data -> data.length(); // 1
		System.out.println("Chars: " + processador.processar("Campus Party 2018"));
	}
}
