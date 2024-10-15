package ds.arrayofobject;

import java.util.Arrays;

//WAP to calculate per and grade for multiple students .Take students array
public class Student1 {
	int rno;
	String name;
	int marks[];
	double percentage;
	String grade;

	public Student1(int rno, String name, int marks[]) {
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

	public void calculatePercentage() {
		double total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		percentage = (total / (5 * 100)) * 100;
	}

	public static Student1[] createArray() {

		Student1[] stud = new Student1[7];

		stud[0] = new Student1(1, "Ajinkya", new int[] { 90, 99, 88, 97, 96 });
		stud[1] = new Student1(2, "abhi", new int[] { 91, 92, 93, 88, 77 });
		stud[2] = new Student1(3, "Aniket", new int[] { 70, 80, 75, 56, 61 });
		stud[3] = new Student1(4, "Avi", new int[] { 80, 55, 7, 58, 66 });
		stud[4] = new Student1(5, "Adi", new int[] { 20, 30, 40, 50, 21 });
		stud[5] = new Student1(2, "ajay", new int[] { 91, 92, 93, 88, 77 });
		stud[6] = new Student1(5, "ram", new int[] { 20, 30, 40, 50, 21 });


		for (int i = 0; i < stud.length; i++) {
			stud[i].calculatePercentage();
			stud[i].calculateGrade();
		}
		return stud;
	}

	public String toString() {
		return "Rollno : " + rno + "\nName : " + name + "\nMarks : " + Arrays.toString(marks) + "\nPercentage : "
				+ percentage + "\nGrade : " + grade;
	}

	public static void printStudent(Student1 s[]) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			System.out.println("___________________________________");
		}
	}

	public static void maxPerStudent(Student1 st[]) {
		Student1 maxStud = st[0];
		for (int i = 0; i < st.length; i++) {
			if (st[i].percentage > maxStud.percentage) {
				maxStud = st[i];
			}
		}
		System.out.println("\nStudent having max per is: " + maxStud.name+"\n");
	}

	public static void studByGrade(Student1 st[]) {
		System.out.print("Students having grade A: "); 
		for (int i = 0; i < st.length; i++) {
			if(st[i].grade=="A") {
				System.out.print(st[i].name+" ");
			}
		}
		System.out.println();
		System.out.print("Students having grade B: "); 
		for (int i = 0; i < st.length; i++) {
			if(st[i].grade=="B") {
				System.out.print(st[i].name+" ");
			}
		}
		System.out.println();
		System.out.print("Students having grade C: "); 
		for (int i = 0; i < st.length; i++) {
			if(st[i].grade=="C") {
				System.out.print(st[i].name+" ");
			}
		}
		System.out.println();
		System.out.print("Students having grade D: "); 
		for (int i = 0; i < st.length; i++) {
			if(st[i].grade=="D") {
				System.out.print(st[i].name+" ");
			}
		}
		System.out.println();
		System.out.print("Fail students: "); 
		for (int i = 0; i < st.length; i++) {
			if(st[i].grade=="Fail") {
				System.out.print(st[i].name+" ");
			}
		}
	}

	public static void main(String[] args) {

		Student1 stud[] = createArray();
		printStudent(stud);
		maxPerStudent(stud);
		studByGrade(stud);
	}

}
