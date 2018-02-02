package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

//1. Create a CompletableFuture<T> triggered (completed) by a Supplier<T> task
//2. Get the result by joining the main thread
public class CompletableFutureByExample2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = 
				CompletableFuture.supplyAsync(() -> { // 1
					System.out.println("Running a complex task...");
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {}
					return "Once upon a time there was a long thread.";
				});
		
		System.out.println("Result: " + future.join()); // 2
	}
}
