package array.arrayofobjects;

//WAP to cal percentage and grade of student taking marks as array

import java.util.Scanner;

public class Student {
	int rno;
	String name;
	int marks[];
	double percentage;
	String grade;

	public Student() {

	}

	public Student(int rno, String name, int marks[]) {
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}

	public void calculateGrade() {
		if (percentage >= 90) {
			grade = "A";
		} else if (percentage >= 80) {
			grade = "B";
		} else if (percentage >= 60) {
			grade = "C";
		} else if (percentage >= 40) {
			grade = "D";
		} else {
			grade = "Fail";
		}
	}

	public void calculatePercentage(int arr[]) {
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			total = total + n;
		}
		percentage = (total / (5 * 100)) * 100;
	}

	public String toString() {
		return "Roll No: " + rno + " Name: " + name + " percentage: " + percentage + " grade: " + grade;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter marks for 5 Subjects: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		Student s = new Student(1, "Ajinkya", arr);
		s.calculatePercentage(arr);
		s.calculateGrade();
		System.out.println(s);
	}

}
