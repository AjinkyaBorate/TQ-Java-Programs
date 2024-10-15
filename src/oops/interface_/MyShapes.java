package oops.interface_;

public class MyShapes {

	public static void main(String[] args) {
		Circle obj = new Circle(2);
		obj.area();
		obj.print();

		Rectangle obj1 = new Rectangle(2, 3);
		obj1.area();
		obj1.print();

	}

}

abstract class MyShape implements PrintableforMyShapes, VolumeforMyShapes {
}

class Circle extends MyShape {
	double r, area;
	final double pi = 3.14;

	Circle(double r) {
		this.r = r;
	}

	@Override
	public void area() {
		area = 2 * pi * r * r;
	}

	public void volumeCal() {

	}

	@Override

	public void print() {
		System.out.println("Area is :" + area);
	}
}

class Rectangle extends MyShape {
	double l, b, area;

	Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	@Override

	public void area() {
		area = 2 * l * b;
	}

	@Override

	public void print() {
		System.out.println("Area is :" + area);
	}

	public void volumeCal() {

	}

}
