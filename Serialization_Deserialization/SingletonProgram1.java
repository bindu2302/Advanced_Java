package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonProgram1 {

	public static void main(String[] args) throws Exception {
//		Sun s1 = Sun.getObject();
//		Sun s2 = Sun.getObject();
//		Sun s3 = Sun.getObject();
//
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//
//		System.out.println("Number of objects= " + Sun.count);
		
		
		Sun s = Sun.getObject();
		
		//1.serialize (s)
		FileOutputStream fos  = new FileOutputStream("sample.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		//2. de-serialize(s2)
		FileInputStream fis  = new FileInputStream("sample.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sun s2 = (Sun) ois.readObject();
		
		//3. print hashcode of s1 and s2
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Sun implements Serializable{
	static int count = 0;
	static Sun obj;
	private Sun() {
		count++;
		System.out.println("Constructor was called, " + " new object created!");
	}
	
	public static Sun getObject() {
		if(count == 0) {
			obj = new Sun();
		} else {
			System.out.println("New obj not created");
		}
		return obj;
	}
	
	protected Object readResolve() {
		return getObject();
	}
}
