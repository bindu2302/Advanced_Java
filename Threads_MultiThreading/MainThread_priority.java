package Threads_MultiThreading;

public class MainThread_priority {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		
		System.out.println("Default main thread priority: " + 
		mainThread.getPriority());
		
		mainThread.setPriority(Thread.MIN_PRIORITY); 
		System.out.println("Updated main thread priority: " + mainThread.getPriority());
		System.out.println("Main thread executing high-prority tasks.");
	}

}
