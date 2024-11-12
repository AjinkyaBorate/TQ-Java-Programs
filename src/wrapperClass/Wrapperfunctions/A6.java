package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*Implement a utility class called WrapperUtils that provides static methods for:
Converting an int to Integer
Converting a double to Double
Checking if a string is a valid representation of an integer
Checking if a string is a valid representation of a double
*/
public class A6 extends WrapperUtils {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		sc.close();
		intToInteger(11);
		doubleToDoublee(11.0);
		isValidStringOfInt(str);
		isValidStringOfDouble(str);
	}

}

class WrapperUtils {
	public static Integer intToInteger(int i) {
		return Integer.valueOf(i);
	}

	public static Double doubleToDoublee(double d) {
		return Double.valueOf(d);
	}

	public static void isValidStringOfInt(String str) {
		try {
			Integer.parseInt(str);
			System.out.println(str + " string is a valid representation of an integer");
		} catch (NumberFormatException n) {
			System.out.println(str + " string is not a valid representation of a integer");
		}
	}

	public static void isValidStringOfDouble(String str) {
		try {
			Double.parseDouble(str);
			System.out.println(str + " string is a valid representation of an double");
		} catch (NumberFormatException n) {
			System.out.println(str + " string is not a valid representation of a double");
		}
	}
}