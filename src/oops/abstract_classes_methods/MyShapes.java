package oops.abstract_classes_methods;

public class MyShapes {

	public static void main(String[] args) {
		Circle obj = new Circle(2);
		obj.area();
		System.out.println(obj);

		Rectangle obj1 = new Rectangle(2, 3);
		obj1.area();
		System.out.println(obj1);

	}

}

abstract class MyShape {
	public abstract void area();
}

class Circle extends MyShape {
	double r, area;
	final double pi = 3.14;

	Circle(double r) {
		this.r = r;
	}

	public void area() {
		area = pi * r * r;
	}

	@Override
	public String toString() {
		return "Area of circle is: " + area;
	}

}

class Rectangle extends MyShape {
	double l, b, area;

	Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	public void area() {
		area = 2 * l * b;
	}

	@Override
	public String toString() {
		return "Area of Rectangle is: " + area;
	}

}