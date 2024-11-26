package collections.Map.LabAssignments;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
8. Create a treemap of Employee having department , The elements should be inserted in dec 
order of salary*/
public class A8{
	int empid;
	String empname;
	double empsal;

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



	public A8(int empid, String empname, double empsal) {
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", deptname=" +"]";
	}
	
	
	public static void main(String[] args) {
		TreeMap<A8, String> tmap=new TreeMap<A8, String>(new EmpSalinDescOrder());
		tmap.put(new A8(101, "Ajinkya", 50000), "Development");
		tmap.put(new A8(102, "Abhi", 55000), "Development");
		tmap.put(new A8(103, "Aniket", 40000), "Development");
		tmap.put(new A8(105, "Arush", 45000), "Development");
		tmap.put(new A8(110, "Avi", 65000), "Development");
		
		for (Entry<A8, String> s : tmap.entrySet()) {
			System.out.println(s.getKey() + ":" + s.getValue());
		}

	}

}
class EmpSalinDescOrder implements Comparator<A8>{

	@Override
	public int compare(A8 o1, A8 o2) {
		return Double.compare(o2.getEmpsal(),o1.getEmpsal());
	}

}
