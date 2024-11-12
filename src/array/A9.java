package array;

import java.util.Scanner;

// * 9>Sort the array in asending or desending order
public class A9 {
	public static void ascendingOrder(int size, int arr[]) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Array in ASC order: ");
		for(int i=0;i<size;i++) {
        	System.out.print(arr[i]+" ");
        }
		System.out.println();
	}

	public static void descendingOrder(int size, int arr[]) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Array in DSC order: ");
		for(int i=0;i<size;i++) {
        	System.out.print(arr[i]+" ");
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
		sc.close();
		ascendingOrder(size, arr);
		descendingOrder(size, arr);
		
	}

}
