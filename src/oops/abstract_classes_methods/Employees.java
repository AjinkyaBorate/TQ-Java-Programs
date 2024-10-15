package oops.abstract_classes_methods;

/*3.A company has employees and wants to keep a track of their names, id and hours of work. The employees 
are specifically categorised into part-time and full-time. Salary needs to be calculated for both however, 
where part-time employees get 200 rs. Per hour and Full-time employees get 500 rs. per hour. 
Write a program which does the same.*/
public class Employees {

	public static void main(String[] args) {
		Part_Time pt = new Part_Time(1, "Abhi", 5);
		pt.calSalary();
		pt.display();

		Full_Time ft = new Full_Time(2, "Ajinkya", 8);
		ft.calSalary();
		ft.display();

	}

}

abstract class Employee {
	int id;
	String name;
	double hrs, sal;
	
	Employee(int id, String name, double hrs) {
		this.id = id;
		this.name = name;
		this.hrs = hrs;
	}
	abstract void calSalary();
	void display() {};
}

class Part_Time extends Employee {
	Part_Time(int id, String name, double hrs) {
		super(id, name, hrs);
	}

	@Override
	void calSalary() {
		sal = hrs * 200;
	}

	@Override
	void display() {
		System.out.println("ID:" + id + " Name: " + name + " Work Hours: " + hrs + " Salary: " + sal);
	}

}

class Full_Time extends Employee {

	Full_Time(int id, String name, double hrs) {
		super(id, name, hrs);
	}

	@Override
	void calSalary() {
		sal = hrs * 500;

	}

	@Override
	void display() {
		System.out.println("ID:" + id + " Name: " + name + " Work Hours: " + hrs + " Salary: " + sal);
	}

}