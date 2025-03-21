import java.util.InputMismatchException;
import java.util.Scanner;

public class Mutiple_Exceptions {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter 1st number");
			int n1 = sc.nextInt();
			System.out.println("Please enter 2nd number");
			int n2 = sc.nextInt();
			
			int res = n1/n2;
			System.out.println("result: " + res);
			
			System.out.println("Please enter array size:");
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			System.out.println(arr[5]);
			
		} catch(ArithmeticException ae) {
			System.out.println("Denominator should not be 0");
			
		} catch(InputMismatchException ime) {
			System.out.println("Please enter integers!");
			
		}catch(NegativeArraySizeException nas) {
			System.out.println("Array size must be positive");
			
		}catch(ArrayIndexOutOfBoundsException aio) {
			System.out.println("Please enter array size >= 5!");
			
		} catch(Exception ex) {
			System.out.println("Some exception occurred!");
			ex.printStackTrace();
		}
		
	}

}
