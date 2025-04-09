package Serialization_Deserialization;

import java.io.*;

public class Program2 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("sample1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student st = (Student) ois.readObject();
		
		System.out.println(st.roll);
		System.out.println(st.name);
		
		ois.close();
		fis.close();
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
