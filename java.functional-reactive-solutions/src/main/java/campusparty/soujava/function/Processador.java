package campusparty.soujava.function;

@FunctionalInterface
public interface Processador<T, R> {
	R processar(T data);
}
