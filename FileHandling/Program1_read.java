package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Program1_read {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("sample1.txt");
		
		int ch = 0;
		while((ch = reader.read()) != -1) {
			System.out.println((char)ch);
		}
		reader.close();
	}

}
