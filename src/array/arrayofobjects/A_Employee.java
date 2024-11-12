package array.arrayofobjects;

import java.util.Arrays;
//8 oct
/*1.WAP to print the employees from Employee[] array who has same salary (Create Employee class which
 *  has 3 attributes id, name, salary, skill[] and add employee objects to your array)
Find the employee with highest salary

*/public class A_Employee {
	int id;
	String name;
	double sal;
	String skill[];

	A_Employee(int id, String name, double sal, String skill[]) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.skill = skill;
	}

	public static A_Employee[] createArray() {
		A_Employee[] earr = new A_Employee[5];

		earr[0] = new A_Employee(1, "Ajinkya", 100000, new String[] { "java", "c" });
		earr[1] = new A_Employee(2, "Abhi", 90000, new String[] { "html", "python" });
		earr[2] = new A_Employee(3, "Aniket", 70000, new String[] { "js", "c++" });
		earr[3] = new A_Employee(4, "Ajay", 70000, new String[] { "dbms" });
		earr[4] = new A_Employee(5, "Avi", 70000, new String[] { "xyz" });

		return earr;
	}

	public String toString() {
		return "ID : " + id + "\nName : " + name + "\nsalary : " + sal + "\nSkills : " + Arrays.toString(skill);
	}

	public static void printEmp(A_Employee e[]) {
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
			System.out.println("___________________________________");
		}
	}

	public static void sameSal(A_Employee e[]) {
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].sal == e[j].sal) {
					System.out.println(e[i].name + " and " + e[j].name + " have the same salary: " + e[i].sal);
				}
			}
		}
	}

	public static void highestSalary(A_Employee e[]) {
		A_Employee highest = e[0];
		for (int i = 1; i < e.length; i++) {
			if (e[i].sal > highest.sal) {
				highest = e[i];
			}
		}
		System.out.println("Employee with the highest salary: "+highest.name);	}

	public static void main(String[] args) {
		A_Employee[] earr = createArray();
		printEmp(earr);
		sameSal(earr);
		highestSalary(earr);
	}

}
