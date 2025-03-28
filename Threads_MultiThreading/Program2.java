package Threads_MultiThreading;

public class Program2 {

	public static void main(String[] args) {
		VideoThread vt = new VideoThread();
		vt.setName("video");
		ChatThread ct = new ChatThread();
		ct.setName("chat");
		ScreenThread st = new ScreenThread();
		st.setName("screen-share");
		
		vt.start();
		ct.start();
		st.start();
	}

}




class VideoThread extends Thread {
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


class ChatThread extends Thread {
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


class ScreenThread extends Thread {
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
