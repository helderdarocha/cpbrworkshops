package campusparty.soujava.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureByExample1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Void> future = 
				CompletableFuture.runAsync(() -> {
					System.out.println("Running a complex task...");
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {}
					System.out.println("Done...");
				});
		
		future.join();
	}

}
