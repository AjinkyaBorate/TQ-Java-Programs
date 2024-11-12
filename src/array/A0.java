package array;

import java.util.Scanner;
/*
** 1>Print all the array element in reverse order
 * 2>Print alternate number of array
 * 3>print all even numbers of array
 * 4>Count all odd numbers of array
 * 5>Search the elementin an array.
 * 6>Print all prime numbers of array
 * 7>Reverse the array element
 * 8>Shift all o at the end of the array
 * 9>Sort the array in asending or desending order
 * 10>print all the elements of array who contains even digit.
 * 11>//WAP to print number from array whose sum is input given by user for sum
 * 12>//WAP to print sum of prime numbers
 * 13>//Wap to count frequency of each element in array
 * */

public class A0 {
	public static void printArray(int size, int[] arr) {
		System.out.print("Array elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " Elemnets: ");
		for (int i = 0; i <size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		printArray(size, arr);
	}

}
