package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureByExample2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = 
				CompletableFuture.supplyAsync(() -> {
					System.out.println("Running a complex task...");
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {}
					return "Once upon a time there was a long thread.";
				});
		
		System.out.println("Result: " + future.join());
	}
}
