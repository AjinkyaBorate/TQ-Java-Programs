package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*1. Write a program that converts two integers from user input into Integer wrapper objects.
 *Then, compare the two integers and print which one is greater. If they are equal, print that they are equal.
 */
public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int i1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int i2 = sc.nextInt();
		sc.close();
		
		
		Integer i3 = Integer.valueOf(i1);
		Integer i4 = Integer.valueOf(i2);

		if (i3 > i4) {
			System.out.println(i1 + " is greater");
		} else if (i3 < i4) {
			System.out.println(i3 + "Are equal");
		} else {
			System.out.println("Are smaller");
		}
	}

}
