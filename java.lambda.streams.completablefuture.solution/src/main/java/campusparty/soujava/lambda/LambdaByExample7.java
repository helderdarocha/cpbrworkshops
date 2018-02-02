package campusparty.soujava.lambda;

import campusparty.soujava.function.Comando;
import campusparty.soujava.function.Processador;

//7. LAMBDA: inferência das interfaces
//7.1 Passe as expressões lambda diretamente para os métodos (o código não sabe mais nada
//    sobre tipos das interfaces, seus métodos, nem tipos de retorno/parametros)
public class LambdaByExample7 {
	
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
		fazer(() -> System.out.println("AAAAA!")); // 1
		System.out.println("Chars: " + medir(data -> data.length(), "Campus Party 2018"));  // 1
		System.out.println(transformar(data -> "["+data.toUpperCase()+"]", "Campus Party 2018"));  // 1
	}
}
