package array;

import java.util.Scanner;

//WAP to print number from array whose sum is input given by user for sum
public class A11 {
	public static void checkSum(int arr[], int size, int sum) {
		System.out.print("Numbers whose sum is "+sum+" are: ");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("[" + arr[i] + "," + arr[j] + "]");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " Elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Sum : ");
		int sum = sc.nextInt();
		sc.close();
		checkSum(arr, size, sum);
	}

}
