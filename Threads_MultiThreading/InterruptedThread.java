package Threads_MultiThreading;

public class InterruptedThread {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start();
	}

}

class MyThread extends Thread
{
	public void run() {
		for(int i=1; i<=10; i++) {
			if(i==5)
				Thread.currentThread().interrupt();
			if(Thread.interrupted()) 
				return;
			System.out.println("Executing task: " + i);
		}
	}
}
