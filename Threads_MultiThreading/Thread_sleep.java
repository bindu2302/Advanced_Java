package Threads_MultiThreading;

public class Thread_sleep {

	public static void main(String[] args) {
		System.out.println("Main thread starting");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Main thread resuming after sleep.");
		System.out.println("Performing another task in the main thread.");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted again.");
		}
		System.out.println("Main thread finishing");
	}

}
