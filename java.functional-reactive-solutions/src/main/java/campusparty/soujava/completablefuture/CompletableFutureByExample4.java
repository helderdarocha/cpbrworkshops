package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureByExample4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		CompletableFuture.supplyAsync(() -> {
			System.out.println("Running a complex task...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			return "Once upon a time there was a long thread.";
		}, service).thenAccept(data -> System.out.println("Result: " + data));

		service.shutdown();
	}
}
