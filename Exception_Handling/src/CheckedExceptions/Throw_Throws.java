package CheckedExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_Throws {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.bankService();
	}
}

class Bank {
	public void bankService() {
		System.out.println("Bank service executing");
	
			try {
				Atm atm = new Atm();
				atm.atmService();
			} catch(InputMismatchException ime) {
				System.out.println("Exception info received by bank");
			}
			System.out.println("Bank service terminating");
		
	}
}

class Atm{
	public void atmService() {
		System.out.println("ATM service executing");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter atm pin");
			int pin = sc.nextInt();
			System.out.println("Pin = " + pin);

		}
		catch (InputMismatchException ime) {
			System.out.println("Atm handle the exception");
			throw ime;
		}
		finally {
			System.out.println("ATM service terminating");
		}

	}
}