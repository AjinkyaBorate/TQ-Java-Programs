package collections.Comparator_Comparable.LabAssignments_Comparable;

import java.util.ArrayList;
import java.util.Collections;

//5. Now do sorting on id but based on inbuilt compareTo method. Ensure to check 3 null conditions
public class A5 {
	public static void main(String[] args) {
		ArrayList<Employeee> elist = new ArrayList<>();
		Employeee e1 = new Employeee(null, "Ajinkya", "Developer", 22);
		Employeee e2 = new Employeee(106, "Abhi", "Java Developer", 20);
		Employeee e3 = new Employeee(null, "Aniket", "PHP Developer", 25);
		Employeee e4 = new Employeee(102, "Arush", "Web Developer", 28);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		for (Employeee e : elist) {
			System.out.println(e);
		}
		System.out.println("After Sort by id:");
		Collections.sort(elist);
		for (Employeee e : elist) {
			System.out.println(e);
		}

	}

}

class Employeee implements Comparable<Employeee> {
	String name, designation;
	int age;
	Integer id;

	public Employeee(Integer id, String name, String designation, int age) {
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "ID:" +id+ " Name: " + name + " Designation:" + designation + " Age:" + age;
	}

	@Override
	public int compareTo(Employeee o) {
        // Check for nulls in both objects' IDs
        if (this.id == null && o.id == null) {
            return 0;
        } else if (this.id == null) {
            return -1;
        } else if (o.id == null) {
            return 1;
        }
        return this.id.compareTo(o.id); // Use inbuilt compareTo
    }
}
