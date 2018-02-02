package campusparty.soujava.function;

//Exemplo de uma interface funcional que RECEBE () e RETORNA P
//(pode ser sempre substituida por Supplier<P>)

public interface Produtor<P> {
	P produzir();
}
