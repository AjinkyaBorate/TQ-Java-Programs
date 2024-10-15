package oops.inheritance;

public class Employee {

	int id;
	String name;
	String email;
	long no;
	double sal, pf, hra, da, netsal;
	MyDate doj;

	public Employee() {
		System.out.println("In default ctr of Employee");
		id = 0;
		name = " ";
		email = " ";
		sal = 0;
		doj = new MyDate();
	}

	public Employee(int id, String name, String email, long no, double sal, MyDate doj) {
		System.out.println("In parametric constructor of Employee");
		this.id = id;
		this.name = name;
		this.email = email;
		this.no = no;
		this.sal = sal;
		this.doj = doj;
	}

	public void calculateSalary() {
		pf = sal * 0.10;
		hra = sal * 0.15;
		da = sal * 0.20;
		netsal = sal + hra + da - pf;
	}

	public String toString() {
		return "Eid :" + id + "\nName :" + name + "\nEmail :" + email + "\nSalary :" + sal + "\nJoining Date :" + doj
				+ "\nPF : " + pf + "\nHRA :" + hra + "\nDA:" + da + "\nNetSalary :" + netsal;
	}

	public static void main(String[] args) {
//		Employee obj=new Employee();
//		System.out.println(obj);
		MyDate d1 = new MyDate(1, 2, 2024);
		Employee obj1 = new Employee(1, "Ajinkya", "a21@gmail.com", 9028798888L, 50000.00, d1);
		System.out.println(obj1);
	}
}
