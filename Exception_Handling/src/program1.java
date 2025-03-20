// exception cause- Abrupt/abnormal termination
// Exception : it is an event in program  which disturbs the Happy/Normal flow of program

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		
		System.out.println("Division is starting");
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter 1st number");
			int a = sc.nextInt();
			System.out.println("Please enter 2nd number");
			int b = sc.nextInt();
			
			int res = a/b;
			System.out.println("result = " + res);
			
			
		} catch(Exception ex){
			System.out.println("Exception was handled");
			ex.printStackTrace();
		}
		
		finally {
		System.out.println("Division has ended");
		System.out.println("Some other operations");
		}
		

	}

}

// 5 exception
//NullPointerException
//ClassCastException
//InputMismatchException

// final  -- keyword, finally{}, finalize()
