package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("sample1.txt");
		int i;
		
		while((i=reader.read()) != -1) {
			System.out.println((char)i);
		}
		reader.close();
	}

}
