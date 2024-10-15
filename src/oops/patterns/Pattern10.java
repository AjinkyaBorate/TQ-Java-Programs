package oops.patterns;
//1 22 333 4444 55555 666666 .... n

import java.util.Scanner;

public class Pattern10 {
	public void show(int terms) {
		for (int i = 1; i <= terms; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int terms = sc.nextInt();

		Pattern10 obj = new Pattern10();
		obj.show(terms);
		sc.close();
	}
}
