package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Read_writeObject {

	public static void main(String[] args) throws Exception {
		// First, write the objects
		writeObjects();

		// Then, read the objects
		readObjects();
	}

	public static void writeObjects() throws Exception {
		FileOutputStream fos = new FileOutputStream("sample.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Student st1 = new Student(1, "deep");
		Student st2 = new Student(2, "deepak");
		Student st3 = new Student(3, "deepika");

		oos.writeObject(st1);
		oos.writeObject(st2);
		oos.writeObject(st3);

		oos.close();
		fos.close();
	}

	public static void readObjects() throws Exception {
		FileInputStream fis = new FileInputStream("sample.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				Student st = (Student) ois.readObject();
				System.out.println(st);
			}
		} catch (Exception ex) {
			System.out.println("Completed reading!");
		}

		ois.close();
		fis.close();
	}
}

class Student implements Serializable {
	int roll;
	String name;

	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{roll=" + roll + ", name='" + name + "'}";
	}
}
