package collections.Set.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class Employee {
	int empid;
	String empname;
	double empsal;
	String deptname;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Employee(int empid, String empname, double empsal, String deptname) {
		this.deptname = deptname;
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", deptname=" + deptname + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptname, empid, empname, empsal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptname, other.deptname) && empid == other.empid
				&& Objects.equals(empname, other.empname)
				&& Double.doubleToLongBits(empsal) == Double.doubleToLongBits(other.empsal);
	}

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee(1, "Ajinkya", 50000.0, "Software Development"));
		hs.add(new Employee(2, "Abhi", 55000.0, "DA"));
		hs.add(new Employee(3, "Avi", 45000.0, "CC"));
		hs.add(new Employee(4, "Aniket", 30000.0, "AI"));
		hs.add(new Employee(4, "Aniket", 30000.0, "AI"));

		for (Employee e : hs) {
			System.out.println(e);
		}

	}

}
