package campusparty.soujava.function;

// Exemplo de uma interface funcional que RECEBE () e RETORNA {}
// (pode ser sempre substituida por Runnable)

@FunctionalInterface
public interface Comando {
	void executar();
}
