package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*
 * Create a method that takes an array of strings representing double values. Convert each string to a Double object,
 *  and return the sum of all double values. Handle any potential 	 if the strings cannot be converted.*/
public class A2 {
	public static void stringToDoubleObjectAndThenSum(String str[]) {
		double sum = 0;
		try {
		for (int i = 0; i < str.length; i++) {
			Double d = Double.valueOf(str[i]);//String array elements converted to double
			sum = sum + d;
		}
		System.out.println("sum is: " + sum);
		}catch(NumberFormatException ex){
			System.out.println("Invalid input, only digit values are accepted");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		sc.close();
		String str[] = new String[size];
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}

		stringToDoubleObjectAndThenSum(str);
	}

}
