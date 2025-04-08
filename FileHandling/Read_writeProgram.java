package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_writeProgram {

	public static void main(String[] args) throws IOException {
		
		FileWriter  fw = new FileWriter ("output.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader reader = new FileReader("sample1.txt");
		BufferedReader br = new BufferedReader(reader);
		
		
		String line = "";
		while((line = br.readLine()) != null) {
			bw.write(line + "\n");
		}
		br.close();
		bw.close();
	}

}
