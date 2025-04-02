package Threads_MultiThreading;

public class DaemonThread1 {

	public static void main(String[] args) {
		
		VideoThread1 vt = new VideoThread1();
		
		PictureThread pt = new PictureThread();
		pt.setDaemon(true);
		pt.setPriority(1);
		NoiseThread nt = new NoiseThread();
		nt.setDaemon(true);
		nt.setPriority(1);
		
		
		vt.start();
		pt.start();
		nt.start();
	}

}


class VideoThread1  extends Thread {
	public void run() {
		try{
			for(int i =1; i<= 10; i++) {
			System.out.println("Video is playing...");
			Thread.sleep(500);
		}
	}
	 catch(InterruptedException ie) {
		 System.out.println("Some exception occured");
	 }
	}
}

class PictureThread  extends Thread {
	public void run() {
		try{
			for(;;) {
			System.out.println("Enhancing picture quality...");
			Thread.sleep(500);
		}
	}
	 catch(InterruptedException ie) {
		 System.out.println("Some exception occured");
	 }
	}
}


class NoiseThread  extends Thread {
	public void run() {
		try{
			for(;;) {
			System.out.println("Noise reducing...");
			Thread.sleep(500);
		}
	}
	 catch(InterruptedException ie) {
		 System.out.println("Some exception occured");
	 }
	}
}