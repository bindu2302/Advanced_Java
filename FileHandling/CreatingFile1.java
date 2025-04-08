package FileHandling;

import java.io.*;

public class CreatingFile1 {

	public static void main(String[] args) throws IOException{
		File f = new File("sample.txt");
		if(f.createNewFile()) {
			System.out.println("New file created");
		} else {
			System.out.println("File already exists");
		}
	}

}
