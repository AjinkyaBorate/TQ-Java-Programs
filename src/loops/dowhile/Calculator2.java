package loops.dowhile;

import java.util.Scanner;

public class Calculator2 {
	public void show() {
		System.out.println("------Menu-------");
		System.out.println("1. Area of a Circle");
		System.out.println("2. Area of a Square");
		System.out.println("3. Area of a Right Angled Triangle");
		System.out.println("4. Area of a Rectangle");
		System.out.println("5. Circumference of a Circle");
		System.out.println("6. Perimeter of a Square");
		System.out.println("7. Exit");
		System.out.print("Enter your choice (1-7): ");
	}

	public void calculator() {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		do {
			show();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter radius of the circle: ");
				double radius = scanner.nextDouble();
				double areaCircle = Math.PI * radius * radius;
				System.out.println("Area of the circle: " + areaCircle);
				break;
			case 2:
				System.out.print("Enter side length of the square: ");
				double sideSquare = scanner.nextDouble();
				double areaSquare = sideSquare * sideSquare;
				System.out.println("Area of the square: " + areaSquare);
				break;
			case 3:
				System.out.print("Enter base of the triangle: ");
				double base = scanner.nextDouble();
				System.out.print("Enter height of the triangle: ");
				double height = scanner.nextDouble();
				double areaTriangle = 0.5 * base * height;
				System.out.println("Area of the right angled triangle: " + areaTriangle);
				break;
			case 4:
				System.out.print("Enter length of the rectangle: ");
				double length = scanner.nextDouble();
				System.out.print("Enter breadth of the rectangle: ");
				double breadth = scanner.nextDouble();
				double areaRectangle = length * breadth;
				System.out.println("Area of the rectangle: " + areaRectangle);
				break;
			case 5:
				System.out.print("Enter radius of the circle: ");
				double radiusCircumference = scanner.nextDouble();
				double circumference = 2 * Math.PI * radiusCircumference;
				System.out.println("Circumference of the circle: " + circumference);
				break;
			case 6:
				System.out.print("Enter side length of the square: ");
				double sidePerimeter = scanner.nextDouble();
				double perimeterSquare = 4 * sidePerimeter;
				System.out.println("Perimeter of the square: " + perimeterSquare);
				break;
			case 7:
				System.out.println("Exiting program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 7.");
			}
			System.out.print("Do you want to perform another calculation (Y/N)? ");
            ch = scanner.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
        System.out.println("Thank you! Visit again.");

		scanner.close();

	}

	public static void main(String[] args) {
		Calculator2 obj = new Calculator2();
		obj.calculator();

	}

}
