package oops.inheritance;

/*4.Write a Java program to create a class called Shape with a method called getArea(). 
 * Create a subclass called Rectangle that overrides the getArea() method to calculate
 * the area of a rectangle.
*/
public class Shapes {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.getArea(12, 10);
	}
}

class Shape {
	double area, l, b;

	public void getArea(int l, int b) {
		System.out.println("Area: " + area);
	}
}

class Rectangle extends Shape {
	public void getArea(int l, int b) {
		area = l * b;
		System.out.println("Area is : " + area);
	}
}