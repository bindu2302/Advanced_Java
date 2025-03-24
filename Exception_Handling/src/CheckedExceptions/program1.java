package CheckedExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program1 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.println("Please enter roll:");
			int roll = Integer.parseInt(br.readLine());
			System.out.println("please enter name:");
			String name = br.readLine();
					
			System.out.println("Roll = " + roll);
			System.out.println("Name = " + name);
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
