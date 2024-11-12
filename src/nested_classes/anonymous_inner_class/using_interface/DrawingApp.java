package nested_classes.anonymous_inner_class.using_interface;

/*Create a drawing application with an interface called Shape that defines a method draw().
 *Implement this interface in an outer class named DrawingApp using non-static inner classes 
 *for different shapes (e.g., Circle, Rectangle). The outer class should contain a method that 
 *creates instances of these shapes and calls their draw() methods, printing out the shape details.
*/
interface Shape {
	public void draw();
}

public class DrawingApp {
	Shape circle = new Shape() {

		@Override
		public void draw() {
			System.out.println("This is circle");
		}
	};
	Shape rectangle = new Shape() {

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("This is Rectangle");

		}
	};

	public static void main(String[] args) {
		DrawingApp da = new DrawingApp();
		da.circle.draw();
		da.rectangle.draw();
	}
}
