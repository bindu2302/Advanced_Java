package CheckedExceptions;

public class InfinteRecursion {

	public static void main(String[] args) {
		
		fun();
	}
	
	public static void fun() {
		System.out.println("fun() is executing");
		fun();  //StackOverflowError
	}

}
