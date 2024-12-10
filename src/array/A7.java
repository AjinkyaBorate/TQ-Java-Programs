package array;

import java.util.Scanner;

// * 7>Reverse the array element
public class A7 {

	public static void reverseArray(int size, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		System.out.print("Reversed Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.print("Enter " + size + " Elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		reverseArray(size, arr);
	}
}
