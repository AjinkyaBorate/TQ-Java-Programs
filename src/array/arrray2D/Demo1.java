package array.arrray2D;

import java.util.Scanner;

public class Demo1 {
	public static int[][] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter size of columns: ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter element["+i+","+j+"] :");
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

	public static void main(String[] args) {
		int array[][]=createArray();
		printArray(array);
	}
}
