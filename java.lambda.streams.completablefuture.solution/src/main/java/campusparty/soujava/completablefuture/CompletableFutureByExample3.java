package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

//1. Create a CompletableFuture<T> triggered (completed) by a Supplier<T> task
//2. Add a Consumer<T> stage (returns CompletableFuture<Void>) to show results
//3. Synchronize with the main thread calling join or get (necessary because ForkJoinPool threads are daemon)
public class CompletableFutureByExample3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> { // 1
			System.out.println("Running a complex task...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			return "Once upon a time there was a long thread.";
		}).thenAccept(data -> System.out.println("Result: " + data)); // 2
		
		future.join();
	}
}
