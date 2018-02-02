package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// 1. Create a CompletableFuture<Void> triggered (completed) by a Runnable task
// 2. Join the main thread (this is necessary because the ForkJoinPool uses daemon threads)
public class CompletableFutureByExample1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Void> future = 
				CompletableFuture.runAsync(() -> { // 1
					System.out.println("Running a complex task...");
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {}
					System.out.println("Done...");
				});
		
		future.join(); // 2
	}

}
