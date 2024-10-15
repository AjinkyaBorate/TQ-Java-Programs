package oops.patterns;
import java.util.Scanner;
//Prime numbers for n terms

public class Pattern14 {
	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();

		Pattern14 obj = new Pattern14();
		int count = 0; 
		int i = 2;
		System.out.print("Prime series for n terms: ");

		while (count < n) {
			if (obj.isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		sc.close();
	}

}
