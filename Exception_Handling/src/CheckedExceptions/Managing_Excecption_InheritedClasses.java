package CheckedExceptions;

import java.io.IOException;

public class Managing_Excecption_InheritedClasses {

	public static void main(String[] args) {

	}
	
	class Parent {
		public void fun() throws RuntimeException {
			System.out.println("Parent fun");
		}
	}
	
	class Childs extends Parent {
		public void fun()  throws ArithmeticException{
			System.out.println("Child fun");
		}
	}

}



//1. Overridden method must throw same exception or no exception at all
//2. Exception thrown by overridden method may be sub-class of exception thrown by parent method.
//3. Different RuntimeException can be thrown by overridden method.
