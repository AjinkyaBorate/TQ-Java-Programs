package ds.arrayofobject;

import java.util.Arrays;

/*1.WAP to print the employees from Employee[] array who has same salary (Create Employee class which
 *  has 3 attributes id, name, salary, skill[] and add employee objects to your array)
Find the employee with highest salary

2. Create array of students, student has (roll, name, age, marks[]). Print only
those students who have percentage more than 60 
Find the topper of the all student 

3.Employee class is as follows .
Employee {
int empno ;
String name ;
Department dept ;
}
Where dept is object of department class. Department class
as deptId and deptname.
Write a program to create array of 3 employees. Each
employee will have different department. 

4. Create a supplier class having id , name, phone and list of items he supplies and then display the supplier 
who supplies Juice
*/public class Employee1 {
	int id;
	String name;
	double sal;
	String skill[];

	Employee1(int id, String name, double sal, String skill[]) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.skill = skill;
	}

	public static Employee1[] createArray() {
		Employee1[] earr = new Employee1[5];

		earr[0] = new Employee1(1, "Ajinkya", 100000, new String[] { "java", "c" });
		earr[1] = new Employee1(2, "Abhi", 90000, new String[] { "html", "python" });
		earr[2] = new Employee1(3, "Aniket", 70000, new String[] { "js", "c++" });
		earr[3] = new Employee1(4, "Ajay", 70000, new String[] { "dbms" });
		earr[4] = new Employee1(5, "Avi", 70000, new String[] { "xyz" });

		return earr;
	}

	public String toString() {
		return "ID : " + id + "\nName : " + name + "\nsalary : " + sal + "\nSkills : " + Arrays.toString(skill);
	}

	public static void printEmp(Employee1 e[]) {
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
			System.out.println("___________________________________");
		}
	}

	public static void sameSal(Employee1 e[]) {
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].sal == e[j].sal) {
					System.out.println(e[i].name + " and " + e[j].name + " have the same salary: " + e[i].sal);
				}
			}
		}
	}

	public static void highestSalary(Employee1 e[]) {
		Employee1 highest = e[0];
		for (int i = 1; i < e.length; i++) {
			if (e[i].sal > highest.sal) {
				highest = e[i];
			}
		}
		System.out.println("Employee with the highest salary: "+highest.name);	}

	public static void main(String[] args) {
		Employee1[] earr = createArray();
		printEmp(earr);
		sameSal(earr);
		highestSalary(earr);
	}

}
