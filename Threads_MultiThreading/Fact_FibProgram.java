package Threads_MultiThreading;

import java.util.Scanner;

class FactorialThread extends Thread {
		private int n;
		
		public FactorialThread(int n) {
			this.n = n;
		}
		public void run() {
			int fact = 1;
			for(int i=1; i<=n; i++) {
				fact = fact * i;		
			}
			System.out.println("Factorial of " + n + ": "+ fact);
		}
		
	}
	
	class FibonacciThread extends Thread {
		private int n;
		
		public FibonacciThread(int n) {
			this.n = n;
		}
		
		public void run() {
			System.out.print("Fibonacci Series up to " + n + ": " );
			int a = 0, b=1;
			System.out.print(a + " " + b + " ");
			for(int i=3; i<=n; i++) {
				int next = a+b;
				System.out.print(next + " ");
				a = b;
				b = next;
			}
			System.out.println();
		}
	}

	public class Fact_FibProgram {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			try {
				FactorialThread factThread = new FactorialThread(n);
				FibonacciThread fibThread = new FibonacciThread(n);
				
				factThread.start();
				factThread.join();
				fibThread.start();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
