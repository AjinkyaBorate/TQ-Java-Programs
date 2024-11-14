package collections.Comparator_Comparable.LabAssignments_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import oops.containments.MyDate;

/*0.Let employee class have a department object. Iterate through aarraylist of employees.
    Sort arraylist of employees on employee names using comparable interface.
    Sort arraylist of employees on department names using comparator interface
    print Emp whose salary is > 10000 
    print Emp who have name ""Sachin"" 
    print Emp who have highest of salary*/
public class A0_SortEmp {
	public static ArrayList<A0_Employee> createArrayList() {
		ArrayList<A0_Employee> emplist = new ArrayList<A0_Employee>();
		A0_Employee e = new A0_Employee(1, "Abc", "Comp", "s", 90909090l, 80000, new MyDate(1, 11, 2024));
		emplist.add(e);
		A0_Employee e1 = new A0_Employee(2, "Xyz", "Comp", "s", 80808080l, 8000, new MyDate(1, 11, 2024));
		emplist.add(e1);
		A0_Employee e2 = new A0_Employee(3, "Yz", "Mech", "s", 980808080l, 100000, new MyDate(1, 11, 2024));
		emplist.add(e2);
		A0_Employee e3 = new A0_Employee(4, "Pqr", "Comp", "s", 90808080l, 4000, new MyDate(1, 11, 2024));
		emplist.add(e3);

		return emplist;
	}

	public static void printUsingForEach(ArrayList<A0_Employee> elist) {
		System.out.println("Employee List using For Each");
		for (A0_Employee e : elist) {
			System.out.println(e.toString());
		}
	}
	
	public static void printSalgreaterthan(ArrayList<A0_Employee> elist) {
		System.out.println("Employees with salary >10000: ");
		for(A0_Employee e:elist) {
			if(e.basicSalary>10000) {
				System.out.println(e);
			}
		}
	}
	public static void printEmployeeWithName(ArrayList<A0_Employee> elist) {
		System.out.println("Employee with name Abc2: ");
		for (A0_Employee e : elist) {
			if(e.empName=="Abc") System.out.println(e);
		}
	}
	public static void printEmpHasMaxSal(ArrayList<A0_Employee> elist) {
		System.out.println("Employee with highest salary: ");
		A0_Employee maxSalEmp=elist.get(0);
		for (A0_Employee e : elist) {
			if(e.basicSalary>maxSalEmp.basicSalary) {
				maxSalEmp=e;
			}			
		}
		System.out.println(maxSalEmp);

	}
	public static void main(String[] args) {
		ArrayList<A0_Employee> arrlist = createArrayList();
		System.out.println("Before Sort: ");
		printUsingForEach(arrlist);

		System.out.println("After Sort by deptname using comparable: ");
		Collections.sort(arrlist);
		printUsingForEach(arrlist);
		
		System.out.println();
		printSalgreaterthan(arrlist);
		
		System.out.println();
		printEmployeeWithName(arrlist);
		
		System.out.println();
		printEmpHasMaxSal(arrlist);

	}

}
