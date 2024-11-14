package collections.Comparator_Comparable.LabAssignments_Comparable;

import java.util.ArrayList;
import java.util.Collections;

//3.WAP to create a class Employee with (name, designation and age).Now create and add Employee
//objects elements to Arraylist. Print ArrayList.

/*4. Now modify Employee class so that it implements Comparable interface’s compareTo
method.Sorting should be done based on id in which use < , > & == technique.*/
public class A3_A4 {

	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<>();
		Employee e1 = new Employee(101, "Ajinkya", "Developer", 22);
		Employee e2 = new Employee(106, "Abhi", "Java Developer", 20);
		Employee e3 = new Employee(103, "Aniket", "PHP Developer", 25);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		for (Employee e : elist) {
			System.out.println(e);
		}
		System.out.println("After Sort by id:");
		Collections.sort(elist);
		for (Employee e : elist) {
			System.out.println(e);
		}

	}

}

class Employee implements Comparable<Employee> {
	String name, designation;
	int age;
	int id;

	public Employee(int id, String name, String designation, int age) {
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "ID:" +id+ " Name: " + name + " Designation:" + designation + " Age:" + age;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id == o.id)
			return 0;
		else if (this.id > o.id)
			return 1;
		else
			return -1;
	}
}
