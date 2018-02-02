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
//5. Add one or more intermediate Function<T,R> stages to transform the data
public class CompletableFutureByExample5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newCachedThreadPool(); // 3
		
		CompletableFuture.supplyAsync(() -> { // 1
			System.out.println("Running a complex task...");
			try {TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) {}
			return "Once upon a time there was a long thread.";
		}, service) // 3
		
		.thenApply(data -> data.toUpperCase()) // 5
		.thenApply(data -> { // 5
			System.out.println(data);
			try {TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) {}
			return data.length();
		 })
		.thenApply(n -> n + " characters") // 5
		
		.thenAccept(data -> System.out.println("Result (length): " + data)); // 2

		service.shutdown(); // 4
		
		
		// See more examples with CompletableFuture in the java8-course repository (java.concurrency project)
	}
}
