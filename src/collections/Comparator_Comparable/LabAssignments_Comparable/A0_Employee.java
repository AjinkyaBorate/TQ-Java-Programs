package collections.Comparator_Comparable.LabAssignments_Comparable;
import oops.containments.DeptEmp_using_Constructor;
import oops.containments.MyDate;
/*1.Let employee class have a department object. Iterate through aarraylist of employees.
    Sort arraylist of employees on employee names using comparable interface.
    Sort arraylist of employees on department names using comparator interface
    print Emp whose salary is > 10000 
    print Emp who have name ""Sachin"" 
    print Emp who have highest number of salary*/

public class A0_Employee implements Comparable<A0_Employee> {
	DeptEmp_using_Constructor dept;
	int empID;
	public String empName;
	String empEmail;
	long empNumber;
	public String dname;
	public double basicSalary;
	MyDate doj;

	public A0_Employee(int id, String name, String depname, String email, long no, double salary, MyDate doj) {
		empID = id;
		empName = name;
		empEmail = email;
		dname = depname;
		empNumber = no;
		basicSalary = salary;
		this.doj = doj;
	}

	public String toString() { 
		return "Employee " + empID + ":  " + empName + " Dept name: " + dname + "  " + empEmail + "  " + empNumber + "  "
				+ basicSalary + " " + doj;
	}

	public static void main(String[] args) {
		MyDate d1 = new MyDate(1, 2, 2024);
		A0_Employee obj1 = new A0_Employee(1, "Ajinkya", "Comp", "a21@gmail.com", 9028798888L, 50000.00, d1);
		System.out.println(obj1);
	}

//For sort sal using comparable
//	@Override
//	public int compareTo(Employee o) {
//		if (this.basicSalary == o.basicSalary)
//			return 0;
//		else if (this.basicSalary < o.basicSalary)
//			return 1;
//		else
//			return -1;
//
//	}
	
//For sort by empName using comparable
//	@Override public int compareTo(Employee o) { return
//	  this.empName.compareTo(o.empName);}

//For sort by dname	using comparable
	@Override
	public int compareTo(A0_Employee o) {
		
		return this.dname.compareTo(o.dname);
	}
}

