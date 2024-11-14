package collections.Comparator_Comparable.LabAssignments_Comparable;
import java.util.ArrayList;
import java.util.Collections;

//6. Now do descending sort of Employeeee.id in Employeeee arraylist using < , > & == technique.
//7. Now do descending sort of Employee.id in Employee arraylist using inbuilt compareTo technique.
public class A6_A7 {
	public static void main(String[] args) {
		ArrayList<Employeeee> elist = new ArrayList<>();
		Employeeee e1 = new Employeeee(101, "Ajinkya", "Developer", 22);
		Employeeee e2 = new Employeeee(106, "Abhi", "Java Developer", 20);
		Employeeee e3 = new Employeeee(103, "Aniket", "PHP Developer", 25);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		for (Employeeee e : elist) {
			System.out.println(e);
		}
		System.out.println("After Sort by id:");
		Collections.sort(elist);
		for (Employeeee e : elist) {
			System.out.println(e);
		}

	}

}

class Employeeee implements Comparable<Employeeee> {
	String name, designation;
	int age;
	int id;

	public Employeeee(int id, String name, String designation, int age) {
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "ID:" + id + " Name: " + name + " Designation:" + designation + " Age:" + age;
	}

	@Override
	public int compareTo(Employeeee o) {
		if (this.id == o.id)
			return 0;
		else if (this.id < o.id)
			return 1;
		else
			return -1;
	}
}
