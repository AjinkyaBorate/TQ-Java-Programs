package oops.containments;
 
/*1.Create a class Department having did, deptName
Create a class Employee having eid, empName, salary and department
Create 3 objects
  > 1.using anonymous department
  > 2. using department object : using contsructor
  > 3. using getter and setter: giving values from your own
check the hashcode generated for department in 1st and 2 nd object
Also print the details of all Employees
 * */

public class DeptEmp_using_Constructor{
	int did;
	String deptName;
	DeptEmp_using_Constructor(int did,String deptName){
		this.did=did;
		this.deptName=deptName;
	}
	public String toString() {
		return "Departname ID: "+did+" Department Name: "+deptName;
	}
	public static void main(String[] args) {
		DeptEmp_using_Constructor obj =new DeptEmp_using_Constructor(123,"Computer");
		System.out.println(obj);
	}
	//for sort by deptname using comparable
	

}
