package Threads_MultiThreading;

public class InterruptedThread2 {

	public synchronized final static void main(String[] args) {
		CheckupTask task = new CheckupTask();
		
		Thread t1 = new Thread(task);
		t1.setName("Superman");
		
		
		Thread t2 = new Thread(task);
		t2.setName("Batman");
		
		t1.start();
		t2.start();
	}

}

class CheckupTask implements Runnable {
	synchronized public void run() {
		String tname = Thread.currentThread().getName();
		try {
			System.out.println(tname + " has entered doctor's chamber");
			Thread.sleep(3000);
			System.out.println(tname + " is undergoing checkup");
			Thread.sleep(3000);
			System.out.println(tname + " has exited doctor's chamber");
			Thread.sleep(3000);
		} 
		catch(Exception e) {
			System.out.println("Exception occured");
		}
	}
}
