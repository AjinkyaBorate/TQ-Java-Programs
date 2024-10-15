package ds.array;
//* 5>Search the elements in an array.
import java.util.Scanner;

public class A5 {	
	public static void searchElement(int size, int arr[], int search) {
		for (int i = 0; i < size; i++) {
			if (search == arr[i]) {
				System.out.print(arr[i] + " is present in array at position " + i);
				break;
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
		System.out.print("Enter number to search: ");
		int search = sc.nextInt();
		sc.close();
		searchElement(size, arr, search);
	}

}
