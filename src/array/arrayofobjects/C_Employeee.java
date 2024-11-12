package array.arrayofobjects;
/*
 * 3.Employee class is as follows .
Employee {
int empno ;
String name ;
Department dept ;
}
Where dept is object of department class. Department class
as deptId and deptname.
Write a program to create array of 3 employees. Each
employee will have different department. 
*/
class Department {
	int deptId;
	String deptName;

	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department ID: " + deptId + ", Department Name: " + deptName;
	}
}

class Employeee {
	int empNo;
	String name;
	Department dept;

	public Employeee(int empNo, String name, Department dept) {
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee Number: " + empNo + ", Name: " + name + ", " + dept;
	}
}

public class C_Employeee {
	public static void main(String[] args) {
		Department dept1 = new Department(101, "HR");
		Department dept2 = new Department(102, "Finance");
		Department dept3 = new Department(103, "IT");

		Employeee[] employees = new Employeee[3];
		employees[0] = new Employeee(1, "A", dept1);
		employees[1] = new Employeee(2, "B", dept2);
		employees[2] = new Employeee(3, "C", dept3);

		for (Employeee emp : employees) {
			System.out.println(emp);
		}
	}
}
