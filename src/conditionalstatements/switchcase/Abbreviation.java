package conditionalstatements.switchcase;

import java.util.Scanner;

public class Abbreviation {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("------Abbreviations------");
			System.out.println("1. wifi ");
			System.out.println("2. sdlc");
			System.out.println("3. ram");
			System.out.println("4. cpu");
			System.out.println("5. ip");
			System.out.println("6. dbms");
			System.out.println("7. Exit");
			System.out.print("Enter your choice (1-7): ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Abbreviation is : " + "Wireless Fidelity");
				break;
			case 2:

				System.out.println("Abbreviation is : " + "Software Development Life Cycle");
				break;
			case 3:
				System.out.println("Abbreviation is : " + "Random Access Storage");
				break;
			case 4:

				System.out.println("Abbreviation is : " + "Central Processing Unit");
				break;
			case 5:

				System.out.println("Abbreviation is : " + "Interner Address");
				break;
			case 6:

				System.out.println("Abbreviation is : " + "Database Management System");
				break;
			case 7:
				System.out.println("Exiting...............");
				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 7.");
			}

		}
	}

}
