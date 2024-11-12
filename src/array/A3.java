package array;

//* 3>print all even numbers of array
import java.util.Scanner;

public class A3 {
	public static void printArray(int size, int[] arr) {
		System.out.print("Original array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void evennumberArray(int size, int[] arr) {
		System.out.print("Even numbers of array: ");
		for (int i = 0; i < size; i++) {
			if (arr[i]%2 == 0) {
				System.out.print(arr[i] + " ");
		}
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
		evennumberArray(size, arr);
		sc.close();
	}

}
