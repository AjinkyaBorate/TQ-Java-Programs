package ds.array;

import java.util.Scanner;

//* 4>Count all odd numbers of array
public class A4 {
	public static void printArray(int size, int[] arr) {
		System.out.print("Original array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int countOddnumbersinArray(int size, int[] arr) {
		int count=0;
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 != 0) {
			count++;
			}
		}
		return count;
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
		System.out.println("odd numbers count: "+countOddnumbersinArray(size, arr));
		sc.close();
	}

}
