package oops.containments;
/*1.Create a class Department having did, deptName
Create a class Employee having eid, empName, salary and department
Create 3 objects
  > 1. using anonymous department
  > 2. using department object : using contsructor
  > 3. using getter and setter: giving values from your own
check the hashcode generated for department in 1st and 2 nd object
Also print the details of all Employees*/
public class EmpDept_using_Constructor {
	int eid;
	String empName;
	double salary;
	String department;
	DeptEmp_using_Constructor d;
	EmpDept_using_Constructor(int eid,String empName,double salary,DeptEmp_using_Constructor d){
		this.eid=eid;
		this.empName=empName;
		this.salary=salary;
		this.d=d;
	}
	public String toString() {
		return "Emp ID: "+eid+" Name: "+empName+" Salary: "+salary+" Department: "+d;
	}
	public static void main(String[] args) {
		//By anonymous call
		//Employee_using_Constructor obj=new Employee_using_Constructor(1,"Ajinkya",50000.0,new Department_using_Constructor(12,"Comp"));
		//By creating object
		DeptEmp_using_Constructor d1=new DeptEmp_using_Constructor(12,"Comp");
		EmpDept_using_Constructor obj=new EmpDept_using_Constructor(1,"Ajinkya",50000.0,d1);
		System.out.println(obj);
	}

}
