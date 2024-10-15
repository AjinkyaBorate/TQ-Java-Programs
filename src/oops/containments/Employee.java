package oops.containments;
//Containments using constructor/toString
public class Employee {
	
	    int empID;
	    String empName;
	    String empEmail;
	    long empNumber;
	    double basicSalary;
	    MyDate doj;

	    public Employee(int id, String name, String email, long no, double salary,MyDate doj) {
	        empID = id;
	        empName = name;
	        empEmail = email;
	        empNumber = no;
	        basicSalary = salary;
	        this.doj=doj;
	    }

	    public String toString() {
	        return "Employee " + empID + ":  " + empName + "  " + empEmail + "  " + empNumber + "  " + basicSalary+" "+doj;
	    }
	    public static void main(String[] args) {
	        MyDate d1=new MyDate(1,2,2024);
	        Employee obj1 = new Employee(1, "Ajinkya", "a21@gmail.com", 9028798888L, 50000.00,d1);
	        System.out.println(obj1);
	    }
	}

