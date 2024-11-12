package oops.datamembers;

import java.util.Scanner;

public class StudentData {
	String sname;
	int rollno, sub1, sub2, sub3, sub4, sub5;
	double percentage;

	public void setData(String name, int roll, int s1, int s2, int s3, int s4, int s5) {
		sname = name;
		rollno = roll;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
		sub5 = s5;
	}

	public void calculatePercentage() {
		double total = sub1 + sub2 + sub3 + sub4 + sub5;
		percentage = (total / 500) * 100;
	}

	public void displayGrade() {
		if (percentage > 80) {
			System.out.println("A");
		} else if (percentage > 60) {
			System.out.println("B");
		} else if (percentage > 40) {
			System.out.println("C");
		} else {
			System.out.println("Fail");
		}
	}

	public void dislplay() {
		System.out.println("");
		System.out.print(
				"Student with roll number " + rollno + " and name " + sname + " has " + percentage + "% and grade is ");
		displayGrade();

	}

	public String toString() {
		return "Name" + sname + "roll" + rollno + "percentage" + percentage;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Roll Number: ");
		int rollno = scanner.nextInt();

		System.out.print("Enter marks for Subject 1(Out of 100): ");
		int sub1 = scanner.nextInt();

		System.out.print("Enter marks for Subject 2(Out of 100): ");
		int sub2 = scanner.nextInt();

		System.out.print("Enter marks for Subject 3(Out of 100): ");
		int sub3 = scanner.nextInt();

		System.out.print("Enter marks for Subject 4(Out of 100): ");
		int sub4 = scanner.nextInt();

		System.out.print("Enter marks for Subject 5(Out of 100): ");
		int sub5 = scanner.nextInt();

		StudentData obj = new StudentData();
		obj.setData(name, rollno, sub1, sub2, sub3, sub4, sub5);
		obj.calculatePercentage();

		System.out.println(obj);

		obj.dislplay();
		scanner.close();

	}

}
