package campusparty.soujava.function;

//Exemplo de uma interface funcional que RECEBE T e RETORNA R
//(pode ser sempre substituida por Function<T,R>)

@FunctionalInterface
public interface Processador<T, R> {
	R processar(T data);
}
