package oops.abstract_classes_methods;

/*2.Write a Java program to create an abstract class Shape with abstract methods calculateArea()
and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods 
to calculate the area and perimeter of each shape.
*/
public class Shapes {

	public static void main(String[] args) {
		Circlee c = new Circlee(5);
		System.out.println("Area of circle is: " + c.calculateArea());
		System.out.println("Perimeter of circle is: " + c.calculatePerimeter());

		Triangle t = new Triangle(1, 3, 3, 4);
		System.out.println("Area of triangle is: " + t.calculateArea());
		System.out.println("Perimeter of triangle is: " + t.calculatePerimeter());
	}

}

abstract class Shape {
	abstract double calculateArea();

	abstract double calculatePerimeter();
}

class Circlee extends Shape {
	double r;

	Circlee(double r) {
		this.r = r;
	}

	double calculateArea() {
		return 2 * r * r * 3.14;
	}

	double calculatePerimeter() {
		return 2 * 3.14 * r;
	}
}

class Triangle extends Shape {
	double side1, h, side2, side3;

	Triangle(double side1, double side2, double side3, double h) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.h = h;
	}

	double calculateArea() {
		return 0.5 * side3 * h;
	}

	double calculatePerimeter() {
		return side1 + side2 + side3;
	}
}
