package CheckedExceptions;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("main is starting");
		alpha();
		System.out.println("main is terminating");
	}
	public static void alpha() {
		System.out.println("alpha is starting");
		beta();
		System.out.println("alpha is terminating");
	}
	public static void beta() {
		System.out.println("beta is starting");
		try {
			gama();
		}catch(Exception ex) {
			System.out.println("beta handle the exception");
			throw ex;
		}
		System.out.println("beta is terminating");
	}
	public static void gama() {
		System.out.println("gama is starting");
		int[] arr = new int[-5];  //NegativeArraySizeException
		System.out.println("gama is terminating");
	}

}
