package nested_classes.static_inner_class;

public class Calculator {

	public static class Operations {

		public static double add(double a, double b) {
			return a + b;
		}

		public static double subtract(double a, double b) {
			return a - b;
		}

		public static double multiply(double a, double b) {
			return a * b;
		}

		public static double divide(double a, double b) {
			return a / b;
		}
	}

	public static void main(String[] args) {
		double num1 = 10;
		double num2 = 5;

		System.out.println("Addition: " + Operations.add(num1, num2));
		System.out.println("Subtraction: " + Operations.subtract(num1, num2));
		System.out.println("Multiplication: " + Operations.multiply(num1, num2));
		System.out.println("Division: " + Operations.divide(num1, num2));
	}
}
