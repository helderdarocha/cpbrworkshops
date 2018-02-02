package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

//4. LAMBDA: simplificação
//4.1. Se houver apenas uma instrução retornando void, pode-se remover as chaves { ... }
//4.2. Se o tipo puder ser inferido, pode-se remover a declaração do tipo no parâmetro
//4.3. Se houver apenas uma instrução retornando valor, pode-se remover o return e as chaves { ... }
public class LambdaByExample4 {

	public static void main(String[] args) {
		Comando gritar = () -> System.out.println("AAAAA!"); // 1
		gritar.executar();

		Processador<String, Integer> processador = (data) -> data.length(); // 2, 3
		System.out.println("Chars: " + processador.processar("Campus Party 2018"));
	}
}
