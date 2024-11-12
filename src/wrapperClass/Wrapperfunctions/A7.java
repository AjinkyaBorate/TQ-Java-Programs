package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*Create an array of Float wrapper objects and populate it with float values. Write a method to find the maximum 
 * and minimum values in the array and print them.*/
public class A7 {
	public static void maxAndMinOfArray(Float arr[]) {
		Float max = arr[0];
		Float min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			Float value = arr[i];
			if (value > max) {
				max = value;
			}
			if (value < min) {
				min = value;
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		Float arr[] = new Float[size];
		System.out.println("Enter " + size + " elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}
		sc.close();
		
		maxAndMinOfArray(arr);
	}

}
