package array;
//* 6>Print all prime numbers of array
import java.util.Scanner;

public class A6 {
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

	public static void PrintPrimeNUmbers(int size, int arr[]) {
		System.out.print("Prime numbers in array: ");
		for (int i = 0; i < size; i++) {
			if (primeCheck(arr[i])) {
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
		sc.close();
		
		PrintPrimeNUmbers(size, arr);
	}

}
