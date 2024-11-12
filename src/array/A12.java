package array;

import java.util.Scanner;
//WAP to print sum of prime numbers
public class A12 {
	public static boolean primeCheck(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	public static void printSumOfPrimeNumbers(int size,int arr[]) {
		int sum=0;
		for(int i=0;i<size;i++) {
			int n=arr[i];
			if(primeCheck(n)) {
				sum=sum+n;
			}
		}
		System.out.println("Sum: "+sum);
		
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
		printSumOfPrimeNumbers(size, arr);

	}

}
