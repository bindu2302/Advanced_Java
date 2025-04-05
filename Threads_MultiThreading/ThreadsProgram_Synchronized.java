import java.util.concurrent.CountDownLatch;

public class ThreadsProgram_Synchronized {
	public static void main(String[] args) {
		
		int threadCount = 5;
		CountDownLatch startSignal = new CountDownLatch(1);
		
		for(int i=0; i<threadCount; i++) {
			final int threadNum = i;
			new Thread (() -> {
				try {
					System.out.println("Thread " + threadNum + " ready and waiting for start signal");
					startSignal.await();
					System.out.println("Thread " + threadNum + " started");
					
				} catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}).start();
		}
		
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Starting all threads");
		startSignal.countDown();
	}
}
