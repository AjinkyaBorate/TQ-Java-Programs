package collections.Map.LabAssignments;

//Create an arraylist of Employees having department Create hashmap
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class A7_Employee {
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

	public A7_Employee(int empid, String empname, double empsal, String deptname) {
		this.deptname = deptname;
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", deptname=" + deptname
				+ "]";
	}

//1) Dept is key and number of employee is value
	public static HashMap<String, Integer> deptwisenoOfEmp(List<A7_Employee> list) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (A7_Employee e : list) {
			if (map.containsKey(e.deptname)) {
				int count = map.get(e.deptname);
				count = count + 1;
				map.put(e.deptname, count);
			} else {
				map.put(e.deptname, 1);
			}
		}
		return map;
	}

//2) Dept is key and names arraylist of employees is value
	public static HashMap<String, ArrayList<String>> deptnamewiseAllEmpNames(List<A7_Employee> list) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (A7_Employee e : list) {
			ArrayList<String> names = new ArrayList<String>();
			if (map.containsKey(e.getDeptname())) {
				names = map.get(e.getDeptname());
				names.add(e.getEmpname());
				map.put(e.getDeptname(), names);
			} else {
				names.add(e.getEmpname());
				map.put(e.getDeptname(), names);
			}
		}
		return map;
	}
	
//3) Dept is key and details of employees is value
	public static HashMap<String, ArrayList<A7_Employee>> deptnamewiseEmpDetails(List<A7_Employee> list) {
		HashMap<String, ArrayList<A7_Employee>> map = new HashMap<String, ArrayList<A7_Employee>>();
		for (A7_Employee e : list) {
			ArrayList<A7_Employee> emps = new ArrayList<A7_Employee>();
			if (map.containsKey(e.getDeptname())) {
				emps=map.get(e.getDeptname());
				emps.add(e);
				map.put(e.getDeptname(), emps);
			} else {
				emps.add(e);
				map.put(e.getDeptname(), emps);
			}
		}

		return map;

	}

	public static void main(String[] args) {
		List<A7_Employee> list = new ArrayList<A7_Employee>();
		A7_Employee e1 = new A7_Employee(1, "Abhi", 80000.0, "Development");
		A7_Employee e2 = new A7_Employee(101, "Avi", 45000.0, "Testing");
		A7_Employee e3 = new A7_Employee(99, "Mike", 65000.0, "Analytics");
		A7_Employee e4 = new A7_Employee(14, "Abhi", 80000.0, "Sales");
		A7_Employee e5 = new A7_Employee(1101, "Sanket", 85000, "HR");
		A7_Employee e6 = new A7_Employee(13, "Gaurav", 80000.0, "Development");
		A7_Employee e7 = new A7_Employee(2111, "Steve", 85000, "HR");

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		System.out.println("Department wise number of Employees:");
		HashMap<String, Integer> map = deptwisenoOfEmp(list);
		for (Map.Entry<String, Integer> s : map.entrySet()) {
			System.out.println(s.getKey() + ":" + s.getValue());
		}
		System.out.println();

		System.out.println("Department wise Names of Employees:");
		HashMap<String, ArrayList<String>> map1 = deptnamewiseAllEmpNames(list);
		for (Entry<String, ArrayList<String>> s1 : map1.entrySet()) {
			System.out.println(s1.getKey() + ":" + s1.getValue());
		}
		System.out.println();

		System.out.println("Department wise Employees details:");
		deptnamewiseEmpDetails(list);
		HashMap<String, ArrayList<A7_Employee>> map2 = deptnamewiseEmpDetails(list);
		for (Entry<String, ArrayList<A7_Employee>> s1 : map2.entrySet()) {
			System.out.println(s1.getKey() + ":" + s1.getValue());
		}
	}

}
