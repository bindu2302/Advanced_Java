package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {

	public static void main(String[] args) throws IOException{
		FileWriter writer = new FileWriter("sample1.txt",true);
		writer.write("\nthis is 4th line");
		writer.close();
	}

}
