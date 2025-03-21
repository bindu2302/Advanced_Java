
public class ClassCast_Exception {

	public static void main(String[] args) {
		
		Object obj = "hello";
		Integer num = (Integer) obj;  //ClassCastException: Thrown when an object is forcibly cast to an incompatible type.
	}

}
