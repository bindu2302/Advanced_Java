package Threads_MultiThreading;

public class UsingJoinMethod {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Kodnest service has started");
		
		Training t = new Training();
		t.start();
		Placements p = new Placements();
		p.start();
		
		t.join();
		p.join();
		
		System.out.println("Kodnest service has ended");	
	}
}

class Training extends Thread {
	public void run() {
		System.out.println("Training has started");
		for (int i=1; i<=5; i++) {
			System.out.println("Training is going on");
		}
		System.out.println("Training has Ended");
	}
}

class Placements extends Thread {
	public void run() {
		System.out.println("Placements has started");
		for (int i=1; i<=5; i++) {
			System.out.println("Placements are going on");
		}
		System.out.println("Placements has Ended");
	}
}