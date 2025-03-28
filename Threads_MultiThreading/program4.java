package Threads_MultiThreading;

public class program4 {

	public static void main(String[] args) {
		 
		    // Task creation
			TypeTask type = new TypeTask();
			ErrorCheckTask eCheck = new ErrorCheckTask();
			SavingTask save = new SavingTask();
			
			//thread creation
			Thread t1 = new Thread(type);
			t1.setName("type-thread");
			Thread t2 = new Thread(eCheck);
			t2.setName("error-check-thread");
			Thread t3 = new Thread(save);
			t3.setName("saving-thread");

			t1.start();
			t2.start();
			t3.start();
	}
}

	class TypeTask implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName());
			
			for(int i=1; i<=10; i++) {
				System.out.println("Typing sub-task executing");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	class ErrorCheckTask implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName());
			
			for(int i=1; i<=10; i++) {
				System.out.println("Error-check sub-task executing. .. ...");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	class SavingTask implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().getName());
			
			for(int i=1; i<=10; i++) {
				System.out.println("Saving sub-task executing. .. ...");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	