package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class program1 {

	public static void main(String[] args) throws IOException{
		Student st = new Student(101,"deepika");
		FileOutputStream fos = new FileOutputStream("sample1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(st);
		
		oos.close();
		fos.close();
	}
}

class Student implements Serializable {
	int roll;
	String name;
	public Student(int roll,String name) {
		this.roll = roll;
		this.name = name;
	}
}
