package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program1_write {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		FileWriter writer = new FileWriter("sample1.txt",true);
		
		while(true) {
			System.out.println("Please enter line or 'exit'");
			String data = sc.nextLine();
			if(data.equals("exit")) 
				break;
			else 
				writer.write("\n" + data);
		}
			writer.close();
	}
}
	
