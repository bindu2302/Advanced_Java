package Threads_MultiThreading;

public class Deadlock_program {

	public static void main(String[] args) {
		ReadingTask task = new ReadingTask();
		
		Thread t1 = new Thread();
		t1.setName(null);
	}
}

class ReadingTask implements Runnable {
	public void run() {	
		Library lib = new Library();
		
		String tname = Thread.currentThread().getName();
		try {
			if(tname.equals("batman"))
				lib.batmanReads();
			else
				lib.supermanReads();
		} catch(InterruptedException ie) {
			System.out.println("Some exception occurred");
		}
	}
}
class Library {
	String res1 = "java book";
	String res2 = "Sql book";
	String res3 = "React book";
	
	public void batmanReads() throws InterruptedException{
		synchronized(res1) {
			System.out.println(res1 + " is occupied");
			Thread.sleep(3000);
		}
		synchronized(res2) {
			System.out.println(res2 + " is occupied");
			Thread.sleep(3000);
		}
		synchronized(res3) {
			System.out.println(res3 + " is occupied");
			Thread.sleep(3000);
		}
	}
	
	public void supermanReads() throws InterruptedException{
		synchronized(res1) {
			System.out.println(res1 + " is occupied");
			Thread.sleep(3000);
		}
		synchronized(res2) {
			System.out.println(res2 + " is occupied");
			Thread.sleep(3000);
		}
		synchronized(res3) {
			System.out.println(res3 + " is occupied");
			Thread.sleep(3000);
		}
	}	
}
