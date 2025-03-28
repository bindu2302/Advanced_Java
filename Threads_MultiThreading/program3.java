package Threads_MultiThreading;

public class program3 {
	public static void main(String[] args) {
		
		//task creation
		VideoTask vt = new VideoTask();
		ChatTask ct = new ChatTask();
		ScreenTask st = new ScreenTask();
		
		//thread creation
		Thread t1 = new Thread(vt);
		t1.setName("video Thread");
		Thread t2 = new Thread(ct);
		t2.setName("chat Thread");
		Thread t3 = new Thread(st);
		t3.setName("screen-share Thread");
		
		// start thread
		t1.start();
		t2.start();
		t3.start();
	}

}

class VideoTask implements Runnable {
	public void run() {
		String t = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println(t + " is executing... ...");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}


class ChatTask  implements Runnable {
	public void run() {
		String t = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println(t + " is executing... ...");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}


class ScreenTask implements Runnable {
	public void run() {
		String t = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println(t + " is executing... ...");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

