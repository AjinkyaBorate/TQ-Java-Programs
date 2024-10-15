package loops.whileloop;

import java.util.Scanner;

public class PallindromeNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int original=n;
		int reverse = 0;
		
		while (n > 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
			
		}
		if (original == reverse) {
			System.out.println(original+ " is palllindrome");
		}else {
			System.out.println(original+" not pallindrome");
		}
		sc.close();
	}
}
