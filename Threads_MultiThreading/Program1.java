package Threads_MultiThreading;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		
		TypeThread type = new TypeThread();
		type.setName("type-thread");
		ErrorCheckThread eCheck = new ErrorCheckThread();
		eCheck.setName("error-check-thread");
		SavingThread save = new SavingThread();
		save.setName("saving-thread");
		
		type.start();
		eCheck.start();
		save.start();
	}
}

class TypeThread extends Thread {
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

class ErrorCheckThread extends Thread {
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


class SavingThread extends Thread {
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