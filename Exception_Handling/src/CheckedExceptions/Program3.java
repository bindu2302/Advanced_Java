package CheckedExceptions;

public class Program3 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[-5];
		}
		catch(Exception e1) {
			System.out.println("First catch block");
			try {
				int arr2[] = new int[-10];
			}
			finally {
				System.out.println("finally of 2nd try");
			}
		}
		finally {
			System.out.println("finally of 1st try");
		}
	}

}
