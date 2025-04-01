package Threads_MultiThreading;

public class Movietask_Program {

	public static void main(String[] args) {
		MovieTask task = new MovieTask();
		
		Thread t1 = new Thread(task);
		t1.setName("Superman");
		
		
		Thread t2 = new Thread(task);
		t2.setName("Batman");
		
		t1.start();
		t2.start();
	}

}

class MovieTask implements Runnable {
	public void run() {
		String tname = Thread.currentThread().getName();
		try {
			//select movies
			System.out.println(tname + " is selecting movies");
			
			synchronized(this) {
				//select seats
				for(int i=1; i<=3; i++) {
					System.out.println(tname + " is selecting  seats");
					Thread.sleep(500);
				}
			}
			
			// make payment
			System.out.println(tname + " is making payment.");

		} 
		catch(Exception e) {
			System.out.println("Exception occured");
		}
	}
}
