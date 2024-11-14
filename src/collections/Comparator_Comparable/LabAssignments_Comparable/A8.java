package collections.Comparator_Comparable.LabAssignments_Comparable;

import java.util.ArrayList;
import java.util.Collections;

/*8. Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using
Collections.sort(list) based on name. If name are same then sort on id. Print arrayList.*/
public class A8 {
	public static void main(String[] args) {
		ArrayList<Emp> elist = new ArrayList<>();
		Emp e1 = new Emp(104, "Ajinkya", "Developer", 22);
		Emp e2 = new Emp(106, "Abhi", "Java Developer", 20);
		Emp e3 = new Emp(101, "Aniket", "PHP Developer", 25);
		Emp e4 = new Emp(102, "Arush", "Web Developer", 28);
		Emp e5 = new Emp(111, "Arush", "Web Developer", 28);
		Emp e6 = new Emp(112, "Piyush", "Web Developer", 28);
		Emp e7 = new Emp(109, "Vishal", "Web Developer", 28);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		elist.add(e6);
		elist.add(e7);

		
		for (Emp e : elist) {
			System.out.println(e);
		}
		System.out.println("After Sort by id:");
		Collections.sort(elist);
		for (Emp e : elist) {
			System.out.println(e);
		}

	}

}

class Emp implements Comparable<Emp> {
	String name, designation;
	int age;
	Integer id;

	public Emp(Integer id, String name, String designation, int age) {
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "ID:" + id + " Name: " + name + " Designation:" + designation + " Age:" + age;
	}

	@Override
	public int compareTo(Emp o) {
        int isEqual = this.name.compareTo(o.name);
        if (isEqual != 0) {
            return isEqual; 
        }
        return Integer.compare(this.id, o.id);
	}
}