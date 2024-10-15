package oops.IMP_assignments;

import java.util.Scanner;

public class Denomination {
	public void show(int amount) {
		int note2000 = 0, note500 = 0, note200 = 0, note100 = 0;
		int note50 = 0;
		if (amount >= 2000) {
			note2000 = amount / 2000;
			amount = amount - (note2000 * 2000);
		}

		if (amount >= 500) {
			note500 = amount / 500;
			amount = amount - (note500 * 500);
		}

		if (amount >= 200) {
			note200 = amount / 200;
			amount = amount - (note200 * 200);
		}

		if (amount >= 100) {
			note100 = amount / 100;
			amount = amount - (note100 * 100);
		}

		if (amount >= 50) {
			note50 = amount / 50;
			amount = amount - (note50 * 50);
		}

		System.out.println("Minimum number of notes required:");
		System.out.println("2000 : " + note2000);
		System.out.println("500 : " + note500);
		System.out.println("200 : " + note200);
		System.out.println("100 : " + note100);
		System.out.println("50 : " + note50);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount in multiple of 50: ");
		int amount = scanner.nextInt();
		
		Denomination obj=new Denomination();
		obj.show(amount);
		scanner.close();
	}

}
