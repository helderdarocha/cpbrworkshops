package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class CompletableFutureByExample3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
			System.out.println("Running a complex task...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			return "Once upon a time there was a long thread.";
		}).thenAccept(data -> System.out.println("Result: " + data));
		
		future.join();
	}
}
