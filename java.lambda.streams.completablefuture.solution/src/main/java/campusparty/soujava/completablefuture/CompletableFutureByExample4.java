package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//1. Create a CompletableFuture<T> triggered (completed) by a Supplier<T> task
//2. Add a Consumer<T> stage (returns CompletableFuture<Void>) to show results
//3. Replace the default ForkJoinPool with any ExecutorService containing non-daemon threads
//4. Schedule for shutdown (when threads are done)
public class CompletableFutureByExample4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newCachedThreadPool(); // 3
		
		CompletableFuture.supplyAsync(() -> { // 1
			System.out.println("Running a complex task...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			return "Once upon a time there was a long thread.";
		},service) // 3
		.thenAccept(data -> System.out.println("Result: " + data)); // 2

		service.shutdown(); // 4
	}
}
