package array.arrray2D;

import java.util.Scanner;

public class Demo2 {
	public static int[][] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter size of columns: ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter element[" + i + "," + j + "] :");
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}

	public static void printArray(int arr[][]) {
		System.out.println("Your array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void sumOfRowsEle(int arr[][]) {
		System.out.println("___________________________________");

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + ": " + sum);
		}
	}

	public static void sumOfcolsEle(int arr[][]) {
		System.out.println("___________________________________");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[j][i];
			}
			System.out.println("Sum of columns " + (i + 1) + ": " + sum);
		}
	}

	public static void maxOfRow(int arr[][]) {
		System.out.println("___________________________________");
		for (int i = 0; i < arr.length; i++) {
			int n=arr[0][0];
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>n) {
					n=arr[i][j];
				}
			}
			System.out.println("Max of row "+(i+1)+": "+n);
		}
	}
	public static void maxOfCol(int arr[][]) {
		System.out.println("___________________________________");

		for (int i = 0; i < arr.length; i++) {
			int max=arr[0][0];
			for (int j = 0; j < arr[i].length; j++) {
				max=arr[j][i];
			}
			System.out.println("Max of column " + (i + 1) + ": " + max);
		}
	}

	public static void main(String[] args) {
		int array[][] = createArray();
		printArray(array);
		sumOfRowsEle(array);
		sumOfcolsEle(array);
		maxOfRow(array);
		maxOfCol(array);
	}
}
