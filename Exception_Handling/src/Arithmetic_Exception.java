public class Arithmetic_Exception {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int res = a / b; // Causes ArithmeticException
        System.out.println(res);
    }
}
