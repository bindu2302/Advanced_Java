package Threads_MultiThreading;

public class Producer_Consumer {

	public static void main(String[] args) {
		PizzaShop ps = new PizzaShop();
		
		Chef chef = new Chef(ps);
		Customer customer = new Customer(ps);
		chef.start();
		customer.start();
	}
}

class PizzaShop {
	int token = 1;
	boolean isReady = false;
	
	public synchronized void makePizza() throws InterruptedException {
		if(isReady == false) {
			System.out.println("Chef has made pizza: " + token);
			token++;
			isReady = true;
			notify();
		}
		else {
			wait();
		}
			
	}
	
	public synchronized void eatPizza() throws InterruptedException {
		if(isReady == true) {
			System.out.println("Customer has eaten pizza: " + token);
			isReady = false;
			notify();
		}
		else 
			wait();
	}
}


class Chef extends Thread {
	PizzaShop ps;
	Chef(PizzaShop ps) {
		this.ps = ps;
	}
	
	public void run() {
		while(true) {
			try {
				ps.makePizza();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class Customer extends Thread {
	PizzaShop ps;
	Customer(PizzaShop ps) {
		this.ps = ps;
	}
	
	public void run() {
		while(true) {
			try {
				ps.eatPizza();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
