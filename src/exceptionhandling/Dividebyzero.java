package exceptionhandling;

public class Dividebyzero {

	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}
	}

}
