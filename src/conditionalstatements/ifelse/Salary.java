package conditionalstatements.ifelse;

import java.util.Scanner;

public class Salary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a salary: ");
		int salary = sc.nextInt();
		int gross;

		if (salary <= 10000) {
			gross = salary + ((salary / 100) * 20) + ((salary / 100) * 80);
		} else if (salary <= 20000) {
			gross = salary + ((salary / 100) * 25) + ((salary / 100) * 90);
		} else {
			gross = salary + ((salary / 100) * 30) + ((salary / 100) * 95);
		}
		System.out.println("Gross Salary (With DA & HRA) is: " + gross);
		sc.close();
	}

}
