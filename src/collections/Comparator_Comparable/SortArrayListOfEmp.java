package collections.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import oops.containments.Employee;
import oops.containments.MyDate;

//1.Sort ArrayList of employees on employee names using comparable and comparator
public class SortArrayListOfEmp {
	public static ArrayList<Employee> createArrayList() {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee e = new Employee(1, "Abc", "Comp", "s", 90909090l, 80000, new MyDate(1, 11, 2024));
		emplist.add(e);
		Employee e1 = new Employee(2, "Xyz", "Comp", "s", 80808080l, 50000, new MyDate(1, 11, 2024));
		emplist.add(e1);
		Employee e2 = new Employee(3, "Yz", "Mech", "s", 980808080l, 60000, new MyDate(1, 11, 2024));
		emplist.add(e2);
		Employee e3 = new Employee(4, "Pqr", "Comp", "s", 90808080l, 45000, new MyDate(1, 11, 2024));
		emplist.add(e3);

		return emplist;
	}

	public static void printUsingForEach(ArrayList<Employee> elist) {
		System.out.println("Employee List using For Each");
		for (Employee e : elist) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> arrlist = createArrayList();
		System.out.println("Before Sort: ");
		printUsingForEach(arrlist);

		// Collections.sort(arrlist,new EmpSalComparator());
		Collections.sort(arrlist, new EmpNameComparator());
		System.out.println("Sorting by Sal asending order using Comparator");
		printUsingForEach(arrlist);
	}

}

//sort by name using comparator

class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}

}
//sort by salary using comparator

//class EmpSalComparator implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		if(o1.basicSalary==o2.basicSalary)
//			return 0;
//		else if(o1.basicSalary>o2.basicSalary)
//			return -1;
//		else
//			return 1;
//	}
//	
//}