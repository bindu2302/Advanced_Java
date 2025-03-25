package CheckedExceptions;

import java.util.Scanner;

public class customException {

	public static void main(String[] args) throws EligibilityException {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Please enter percentage:");
         int p = sc.nextInt();
         sc.nextLine(); // Consume the newline character

		if(p>60) 
			System.out.println("Your are eligible");
		else 
			throw new EligibilityException("need min 60%");
		
		System.out.println("Please enter branch:");
	    String branch = sc.nextLine();
			
		
		if(branch.equalsIgnoreCase("CS"))
			System.out.println("Your are eligible");
		else 
			throw new EligibilityException("Only CS allowed");
	}
}

class EligibilityException extends Exception {
	public  EligibilityException(String msg) {
		super(msg);
	}
}
