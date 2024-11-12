package collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import oops.containments.Employee;
import oops.containments.MyDate;

public class Demo2forUserdefinedobjects {
	public static ArrayList<Employee> createArrayList() {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee e = new Employee(1, "abc", "Comp", "s", 90909090l, 80000, new MyDate(1, 11, 2024));
		emplist.add(e);
		Employee e1 = new Employee(2, "xyz", "Comp", "s", 80808080l, 50000, new MyDate(1, 11, 2024));
		emplist.add(e1);
		Employee e2 = new Employee(3, "yz", "Mech", "s", 980808080l, 60000, new MyDate(1, 11, 2024));
		emplist.add(e2);
		Employee e3 = new Employee(4, "pqr", "Comp", "s", 90808080l, 45000, new MyDate(1, 11, 2024));
		emplist.add(e3);
		

		return emplist;
	}

	public static void maxEmpDept(ArrayList<Employee> elist) {
		String maxdept = "";
		int maxcount = 0;
		for (int i = 0; i < elist.size(); i++) {
			String currentdept = elist.get(i).dname;
			int count = 0;
			for (int j = 0; j < elist.size(); j++) {
				if (elist.get(i).dname == elist.get(j).dname) {
					count++;
				}
			}
			if (count > maxcount) {
				maxcount = count;
				maxdept = currentdept;
			}

		}
		System.out.println("Department with the maximum employees: " + maxdept + " with " + maxcount + " employees.");

	}

	public static void maxSalary(ArrayList<Employee> elist) {
		double maxsal = 0;
		for (int i = 0; i < elist.size(); i++) {
			if (elist.get(i).basicSalary > maxsal) {
				maxsal = elist.get(i).basicSalary;

			}
		}
		System.out.println("Max sal is: " + maxsal);
	}

	public static void printUsingForloop(ArrayList<Employee> elist) {
		System.out.println("Employee List using For Loop");
		for (int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i).toString());
		}
	}

	public static void printUsingForEach(ArrayList<Employee> elist) {
		System.out.println("Employee List using For Each");
		for (Employee e : elist) {
			System.out.println(e.toString());
		}
	}

	public static void printUsingIterator(ArrayList<Employee> elist) {
		System.out.println("Employee List using Iterator");
		Iterator<Employee> itr = elist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> al = createArrayList();
		printUsingForloop(al);
		printUsingForEach(al);
		printUsingIterator(al);
		maxEmpDept(al);
		maxSalary(al);
	}

}
