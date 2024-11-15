package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public String toString() {
		return "Name: " + name + " Id: " + id + " Percentage: " + percentage;
	}

	public static void greaterthan(HashMap<Student, String> stud) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter percentage: ");
		double per = sc.nextDouble();
		sc.close();
		Set<Entry<Student, String>> entry = stud.entrySet();
		for (Entry<Student, String> e : entry) {
			if (e.getKey().percentage > per) {
				System.out.println(e.getKey() + ":" + e.getValue());
			}
		}
	}

	public static void checkStudentisPresentinMap(HashMap<Student, String> stud) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name to check presence of student in map: ");
		String n = sc.next();
		sc.close();
		boolean status = false;
		Set<Entry<Student, String>> entry = stud.entrySet();
		for (Entry<Student, String> e : entry) {
			if (e.getKey().name.equals(n)) {
				status = true;
				System.out.println(e.getKey() + ":" + e.getValue());
			}
		}
		if (!status == true)
			System.out.println("Entered student is not present in map");

	}

	public static void main(String[] args) {
		HashMap<Student, String> stud = new HashMap<>();
		Student s1 = new Student(1, "Ajinkya", 92.8);
		Student s2 = new Student(33, "Abhi", 88.2);
		Student s5 = new Student(13, "Ajinkya", 90.8);
		Student s3 = new Student(21, "Pratik", 78.8);
		Student s4 = new Student(122, "Avi", 78.8);

		stud.put(s1, "Placed");
		stud.put(s2, "Not Placed");
		stud.put(s3, "Placed");
		stud.put(s4, "Not Placed");
		stud.put(s5, "Placed");

		System.out.println("Original map: ");
		Set<Entry<Student, String>> ent = stud.entrySet();
		for (Entry<Student, String> e : ent) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		System.out.println();
		System.out.println("Placed students from map are:");
		Set<Entry<Student, String>> entry = stud.entrySet();
		for (Entry<Student, String> e : entry) {
			if (e.getValue() == "Placed") {
				System.out.println(e.getKey() + ":" + e.getValue());
			}
		}
		System.out.println();
		greaterthan(stud);
		System.out.println();
		checkStudentisPresentinMap(stud);

	}

}
