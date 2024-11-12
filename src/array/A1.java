package array;

import java.util.Scanner;
//1>Print all the array element in reverse order

public class A1 {
	public static void printArray(int size, int[] arr) {
		System.out.print("Original array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void reversenumbersinArray(int size, int[] arr) {
		System.out.print("Reverse array: ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " Elemnets: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		printArray(size, arr);
		reversenumbersinArray(size, arr);
		sc.close();
	}

}
