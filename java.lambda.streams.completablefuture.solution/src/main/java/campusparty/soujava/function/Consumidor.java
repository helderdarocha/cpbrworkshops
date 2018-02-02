package campusparty.soujava.function;

//Exemplo de uma interface funcional que RECEBE P e RETORNA {}
//(pode ser sempre substituida por Consumer<P>)

public interface Consumidor<P> {
	void consumir(P produto);
}
