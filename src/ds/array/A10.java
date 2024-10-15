package ds.array;

//* 10>print all the elements of array who contains even digit.
import java.util.Scanner;

public class A10 {
	public static boolean checkEvenDigits(int num) {
		while (num != 0) {
			int digit = num % 10;
			if (digit % 2 != 0) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}
	public static void printEvenDigits(int size,int arr[]) {
		System.out.print("Even numbers with all even digits in array are: ");
		for(int i=0;i<size;i++) {
			int n=arr[i];
			if(checkEvenDigits(n))
			{
				System.out.print(n+" ");
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
		sc.close();
		printEvenDigits(size, arr);
	}

}
