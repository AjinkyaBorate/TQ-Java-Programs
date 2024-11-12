package oops.containments;

//Containments using constructor/toString
public class Employee implements Comparable<Employee> {

	int empID;
	public String empName;
	String empEmail;
	long empNumber;
	public String dname;
	public double basicSalary;
	MyDate doj;

	public Employee(int id, String name, String depname, String email, long no, double salary, MyDate doj) {
		empID = id;
		empName = name;
		empEmail = email;
		dname = depname;
		empNumber = no;
		basicSalary = salary;
		this.doj = doj;
	}

	public String toString() {
		return "Employee " + empID + ":  " + empName + "Dept name: " + dname + "  " + empEmail + "  " + empNumber + "  "
				+ basicSalary + " " + doj;
	}

	public static void main(String[] args) {
		MyDate d1 = new MyDate(1, 2, 2024);
		Employee obj1 = new Employee(1, "Ajinkya", "Comp", "a21@gmail.com", 9028798888L, 50000.00, d1);
		System.out.println(obj1);
	}

	//sort sal using comparable
	@Override
	public int compareTo(Employee o) {
		if (this.basicSalary == o.basicSalary)
			return 0;
		else if (this.basicSalary < o.basicSalary)
			return 1;
		else
			return -1;

	}
	//sort by empName using comparable
	/*
	 * @Override
	 * public int compareTo(Employee o) {
	 * return this.empName.compareTo(o.empName);}
	 */
}
