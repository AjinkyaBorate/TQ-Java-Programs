package ds.array;

import java.util.Scanner;

//Wap to count frequency of each element in array
public class A13 {
	public static void uniqueNum(int size, int arr[]) {

	}

	public static void duplicateNum(int size, int arr[]) {
		System.out.print("Duplicate elements are: ");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				
				if(arr[i]==arr[j]){
					System.out.print(arr[i]+" ");
					}
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
		sc.close();
		duplicateNum(size, arr);
	}

}
