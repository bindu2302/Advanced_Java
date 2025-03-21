import java.util.InputMismatchException;  // Occurs when the Scanner class receives input of an incorrect data type.
import java.util.Scanner;

public class InputMismatch_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the integer:");
			int num = sc.nextInt();
			
		} catch(InputMismatchException e) {
            System.out.println("InputMismatchException occurred!");
		}
	}

}
