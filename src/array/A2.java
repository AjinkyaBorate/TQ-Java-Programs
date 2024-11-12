package array;
// 2>Print alternate number of array
import java.util.Scanner;

public class A2 {
	public static void printArray(int size, int[] arr) {
		System.out.print("Original array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void alternateArray(int size, int[] arr) {
		System.out.print("Alternate elements of array: ");
		for (int i = 0; i< size; i+=2) {
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
		alternateArray(size, arr);
		sc.close();
	}

}
