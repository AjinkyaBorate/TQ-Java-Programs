package oops.containments;

public class EmpDept_using_GetSet {
	int eid;
	String empName;
	double salary;
	DeptEmp_using_GetSet department;
	public void seteid(int eid) {
		this.eid=eid;
	}
	public void setempname(String empName) {
		this.empName=empName;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setdepartment(DeptEmp_using_GetSet department) {
		this.department=department;
	}
	public int getEid() {
        return eid;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public DeptEmp_using_GetSet getDepartment() {
        return department;
    }
	public static void main(String[] args) {
		DeptEmp_using_GetSet d1=new DeptEmp_using_GetSet();
		d1.setId(1);
        d1.setName("comp");
		EmpDept_using_GetSet emp1 = new EmpDept_using_GetSet();
        emp1.seteid(1);
        emp1.setempname("John");
        emp1.setsalary(50000);
        emp1.setdepartment(d1);
        System.out.println(emp1.getEid()+" "+emp1.getEmpName()+" "+emp1.getSalary()+" [ "+emp1.getDepartment()+" ]");
	}
}
