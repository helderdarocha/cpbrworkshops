package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureByExample {

	// 1. Create a CompletableFuture
	// 2. Complete it (use a complete() method: event that triggers any following task)
	// 3. Get the result (joining the main thread: join() or get())
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = new CompletableFuture<>(); // 1

		future.completeOnTimeout("Finished task!", 1, TimeUnit.SECONDS); // 2

		System.out.println("Waiting for task to complete...");
		String result = future.get(); // 3
		System.out.println("Done. Result is " + result);
		
	}

}
