package Mini_Project;

import java.util.ArrayList;

/*Department
 *   -deptno,deptname,location
 * Employee
 *    -empid,ename,basicsal,pf,hra,da,netsal,Department obj,ArrayList<String>skill
 *     calcualteSal()
 *     setter and getters
 *     constructors
 *     toString
 * CURD:
 *  - Create a ArrayList<Employee> and add 10 object
 *  - perform delete operation by accepting id or name    
 *  - perform update operation by passing id and information that can be changable
 *  - Display all employees
 *  - Display employee by providing id ,name,dept*/
public class Employee {
	private int empID;
	private String empName;
	private double basicSal, pf, hra, da, netSal;
	private ArrayList<String> skills;
	Department dept;

	public Employee(int empID, String empName, double basicSal, Department dept, ArrayList<String> skills) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.basicSal = basicSal;
		this.dept = dept;
		this.skills = skills;
		netSalary();
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getNetSal() {
		return netSal;
	}

	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void netSalary() {
		pf = basicSal * 0.10;
		hra = basicSal * 0.15;
		da = basicSal * 0.20;
		netSal = basicSal + hra + da - pf;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", basicSal=" + basicSal + ", netSal=" + netSal
				+ ", " + dept + ", Skills:" + skills + "]";
	}

	public static void main(String[] args) {

	}

}
