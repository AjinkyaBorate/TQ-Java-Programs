//Number Guessing Game
package loops.forloop;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to guess(between 1 to 50): ");

		for (int i = 1;;i++) 
		{

			int guess = sc.nextInt();
			if (guess == n) {
				System.out.println("You Guess right number");
				System.out.println("You guess number in " + i + " attempts");
				break;

			} else if (n < guess) {
				System.out.print("Number is smaller than your entered number, Guess lower number: ");
			} else {
				System.out.print("Number is greater than your entered number, Guess higher number: ");
			}
		}
		sc.close();

	}

}
