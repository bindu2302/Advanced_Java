package CheckedExceptions;

public class Test {

	public static void main(String[] args) {
		System.out.println("main started");
		try {
			alpha();
		}catch(Exception e) {
			System.out.println("Exception received by main");
		}
		System.out.println("Main ended");
	}
	
	private static void alpha() throws Exception {
		System.out.println("alpha started"); 
		try {
			beta();
		}catch(Exception e) {
			System.out.println("alpha handled exception");
			throw e;
		}
		System.out.println("alpha ended");
	}
	
	protected static void beta() throws Exception {
		System.out.println("beta started");
		gama();
		System.out.println("beta ended");
	}
	static void gama() {
		System.out.println("gama started");
		try {
			int[] arr = new int[-5];
		}catch(Exception ex) {
			System.out.println("catch of gama");
			throw ex;
		}finally {
			System.out.println("gama ended");
		}
	}

}
