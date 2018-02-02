package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

// 6. LAMBDA: métodos que recebem interfaces funcionais
// 6.1. Declare dois ou mais métodos static que as interfaces funcionais criadas: todos
//      receberão a interface e poderão receber parâmetros adicionais ou retornar valor,
//      dependendo da interface que usarem; ex: R metodo(<Interface<T,R>, T valor)
// 6.2. Implemente o método simplesmente chamando o método da interface recebida
//      (e passando e recebendo valores se for o caso)
// 6.3. Passe as expressões lambda para esses métodos
public class LambdaByExample6 {
	
	public static int medir(Processador<String,Integer> processador, String texto) { // 1
		return processador.processar(texto); // 2
	}
	
	public static void fazer(Comando comando) { // 1
		comando.executar(); // 2
	}
	
	public static String transformar(Processador<String,String> processador, String texto) { // 1
		return processador.processar(texto); // 2
	}

	public static void main(String[] args) {
		Comando gritar = () -> System.out.println("AAAAA!"); 
		fazer(gritar); // 3

		Processador<String, Integer> comprimento = data -> data.length();
		System.out.println("Chars: " + medir(comprimento, "Campus Party 2018")); // 3
		
		Processador<String, String> caixaAlta = data -> data.toUpperCase();
		System.out.println("Chars: " + transformar(caixaAlta, "Campus Party 2018")); // 3
	}
}
