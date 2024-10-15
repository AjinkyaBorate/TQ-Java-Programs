package conditionalstatements.ifelse;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of first subject out of 20 : ");
		int sub1 = sc.nextInt();
		System.out.println("Enter marks of sec subject out of 20 : ");
		int sub2 = sc.nextInt();
		System.out.println("Enter marks of third subject out of 20 : ");
		int sub3 = sc.nextInt();

		int total = sub1 + sub2 + sub3;
		double percentage = (total / 60.0) * 100;

		char grade;

		if (percentage > 80) {
			grade = 'A';
		} else if (percentage >= 60) {
			grade = 'B';
		} else if (percentage >=50) {
			grade = 'C';
		} else {
			grade='F';
		}
		System.out.println("Total Marks: " + total);
        System.out.println("Percentage: "+ percentage);
        System.out.println("Grade: " + grade);
        sc.close();
	}

}
