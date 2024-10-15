package conditionalstatements.ifelse;

import java.util.Scanner;

public class Denominations {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int amt = scanner.nextInt();

		int note2000 = 0, note500 = 0, note200 = 0, note100 = 0;
		int note50 = 0, note20 = 0, note10 = 0;

		if (amt >= 2000) {
			note2000 = amt / 2000;
			amt = amt - (note2000 * 2000);
		}

		if (amt >= 500) {
			note500 = amt / 500;
			amt = amt - (note500 * 500);
		}

		if (amt >= 200) {
			note200 = amt / 200;
			amt = amt - (note200 * 200);
		}

		if (amt >= 100) {
			note100 = amt / 100;
			amt = amt - (note100 * 100);
		}

		if (amt >= 50) {
			note50 = amt / 50;
			amt = amt - (note50 * 50);
		}

		if (amt >= 20) {
			note20 = amt / 20;
			amt = amt - (note20 * 20);
		}

		if (amt >= 10) {
			note10 = amt / 10;
			amt = amt - (note10 * 10);
		}

		System.out.println("Minimum number of notes required:");
		System.out.println("2000 : " + note2000);
		System.out.println("500 : " + note500);
		System.out.println("200 : " + note200);
		System.out.println("100 : " + note100);
		System.out.println("50 : " + note50);
		System.out.println("20 : " + note20);
		System.out.println("10 : " + note10);

		scanner.close();

	}

}
