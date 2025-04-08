package FileHandling;

import java.io.*;

public class Program1Read_usingBufferReader {

	public static void main(String[] args) throws IOException{
		FileReader reader = new FileReader("sample1.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		
	}

}
