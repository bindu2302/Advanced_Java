package Threads_MultiThreading;

public class Deadlock_bookProgram {

	public static void main(String[] args) {
		
		Reading task = new Reading();
		
		Thread t1 = new Thread(task);
		t1.setName("batman");
		
		Thread t2 = new Thread(task);
		t2.setName("superman");
		
		t1.start();
		t2.start();
	}
}

class Reading implements Runnable {
	public void run() {
		String tname = Thread.currentThread().getName();
	try {
		Library_ l = new Library_();
		if(tname.equals("batman"))
			l.batmanRead();
		else
			l.supermanRead();
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}


class Library_ {
	String book1 = "java";
	String book2 = "sql";
	String book3 = "react";
	
	public void batmanRead() throws InterruptedException {
		String tname = Thread.currentThread().getName();
		
		synchronized(book1)  {
			System.out.println(tname + " has occupied " + book1);
			Thread.sleep(2000);
		synchronized(book2) {
			System.out.println(tname + " has occupied " + book2);
			Thread.sleep(2000);
		
		synchronized(book3) {
			System.out.println(tname + " has occupied " + book3);
			Thread.sleep(2000);
		}
		}
		}
	}


	
	public void supermanRead() throws InterruptedException {
		String tname = Thread.currentThread().getName();
		
		synchronized(book1) {
			System.out.println(tname + " has occupied " + book1);
			Thread.sleep(2000);
		synchronized(book2) {
			System.out.println(tname + " has occupied " + book2);
			Thread.sleep(2000);
		synchronized(book3) {
			System.out.println(tname + " has occupied " + book3);
			Thread.sleep(2000);
		}
		}
		}
				
	}
}
