package oops.datamembers;

public class CalculateEmpSalary {
	int empID;
	String empName;
	String empEmail;
	long empNumber;
	double basicSalary;
	double pf, hra, da, net;

	public void display() {
		System.out.println(
				"Employee " + empID + ":  " + empName + "  " + empEmail + "  " + empNumber + "  " + basicSalary);
		System.out.println("Net Salary of Employee No. " + empID + " is: " + net);
	}

	public void setData(int id, String name, String email, long no, double salary) {
		empID = id;
		empName = name;
		empEmail = email;
		empNumber = no;
		basicSalary = salary;
	}

	public void calculateSal() {
		pf = basicSalary * 0.7;
		hra = basicSalary * 0.12;
		da = basicSalary * 0.15;
		net = basicSalary + hra + da - pf;
	}

	public static void main(String[] args) {

		CalculateEmpSalary obj1 = new CalculateEmpSalary();
		CalculateEmpSalary obj2 = new CalculateEmpSalary();
		CalculateEmpSalary obj3 = new CalculateEmpSalary();
		CalculateEmpSalary obj4 = new CalculateEmpSalary();
		
		obj1.setData(1, "Ajinkya", "a21@gmail.com", 9028798888L, 50000.00);
		obj2.setData(2, "John", "john.doe@example.com", 9028791111L, 60000.00);
		obj3.setData(3, "Emma", "emma.watson@example.com", 9028792222L, 55000.00);
		obj4.setData(4, "Raj", "raj.kumar@example.com", 9028793333L, 58000.00);

		obj1.calculateSal();
		obj2.calculateSal();
		obj3.calculateSal();
		obj4.calculateSal();
		
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();


	}
}
