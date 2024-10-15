package ds.arrayofobject;

public class Employee {
	int eid;
	String name;
	double sal;
	int dno;

	public Employee(int eid, String name, double sal, int dno) {
		this.dno = dno;
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return "ID: " + eid + " Name: " + name + " Sal: " + sal + " Dno: " + dno;
	}

}
