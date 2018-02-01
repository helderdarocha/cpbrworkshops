package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureByExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = new CompletableFuture<>();

		future.completeOnTimeout("Finished task!", 1, TimeUnit.SECONDS);

		System.out.println("Waiting for task to complete...");
		String result = future.get();
		System.out.println("Done. Result is " + result);
		
	}

}
