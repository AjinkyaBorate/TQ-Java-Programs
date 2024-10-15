package oops.methodoverloading;

public class Multiply {
	public void multiply(int i, float j) {
		float mul = i * j;
		System.out.println("Multiplication is: " + mul);
	}

	public void multiply(int a, float b, int c) {
		float mul = a * b * c;
		System.out.println("Multiplication is: " + mul);
	}

	public void multiply(float d, double e) {
		double mul = d * e;
		System.out.println("Multiplication is: " + mul);
	}

	public void multiply(double f, double j) {
		double mul = f * j;
		System.out.println("Multiplication is: " + mul);
	}

	public static void main(String[] args) {

		Multiply obj = new Multiply();
		
		obj.multiply(2, 3f);
		obj.multiply(2, 3f, 5);
		obj.multiply(20f, 10.0);
		obj.multiply(10.0, 22.0);

	}

}
