package collections.Comparator_Comparable.LabAssignments_Comparator;
/*
10. WAP to create a class Student with (rollNo, nameand age). Create 3 Comparator implementations for each Student 
attribute (i.e. rollNo, name and age)
11. Create and add 4 Student objects in ArrayList. Print ArrayList.
12. Sort the list using rollno comparator. Print ArrayList.
13. Sort the list using name comparator. Print ArrayList.
14. Sort the list using age comparator. Print ArrayList.
15. Observe the sorted outputs in case the name, age and name + age are same.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A10_to_A15 {
	public static ArrayList<Student> createArrayList() {
	
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(1, "Abhi", 22));
		slist.add(new Student(22, "Pratik", 20));
		slist.add(new Student(2, "Bhushan", 18));
		slist.add(new Student(31, "Ajinkya", 38));

		return slist;
	}

	public static void printUsingForEach(ArrayList<Student> slist) {
		for (Student s : slist) {
			System.out.println(s.toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Student> slist = createArrayList();
		System.out.println("Sort Using Name:");
		Collections.sort(slist, new Studentname());
		printUsingForEach(slist);
		System.out.println();

		System.out.println("Sort Using Age:");
		Collections.sort(slist, new Studentage());
		printUsingForEach(slist);
		System.out.println();
		
		System.out.println("Sort Using Rollno:");
		Collections.sort(slist, new Studentrollno());
		printUsingForEach(slist);
	}
}

class Student {
	int rollno, age;
	String name;

	public Student(int rollno, String name, int age) {
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
}

class Studentname implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class Studentage implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}
}

class Studentrollno implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getRollno(), o2.getRollno());
	}
}
