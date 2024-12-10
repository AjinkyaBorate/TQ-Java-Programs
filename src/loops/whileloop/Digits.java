package loops.whileloop;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// 1.Display number of digits in ur number
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("Enter a number: ");
		 * int n = sc.nextInt(); int digit=0;
		 * 
		 * while(n!=0) { 
		 * digit=n%10; 
		 * n=n/10; 
		 * digit=digit+1;
		 * System.out.println("Number of digits in ur number: "+digit); 
		 * }
		 */
		// 2.sum of digits in number
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * System.out.print("Enter a number: ");
		 * int n = sc.nextInt(); 
		 * int digit=0; 
		 * int sum=0; 
		 * while(n!=0) { 
		 * digit=n%10;
		 * sum=sum+digit; 
		 * n=n/10; 
		 * } 
		 * System.out.println("sum of digits: "+sum);
		 */

		// 3.sum of odd digits in number

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int digit = 0;
		int sum = 0;
		while (n != 0) {
			digit = n % 10;
			if (digit % 2 != 0) {
				sum = sum + digit;
			}
			n = n / 10;
		}
		System.out.println("sum of digits: " + sum);
		sc.close();
	}

}
