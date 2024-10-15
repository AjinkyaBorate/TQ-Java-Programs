package loops.forloop;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		boolean isPrime=true;

		for (int i = 2;i<number; i++) {
			if (number % i == 0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("is a Prime");
		}
		else {
			System.out.println("is not prime");
		}
		sc.close();

	}

}
