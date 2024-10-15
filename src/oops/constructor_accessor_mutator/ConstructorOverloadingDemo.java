package oops.constructor_accessor_mutator;

public class ConstructorOverloadingDemo {

	int empID;
	String empName;
	String empEmail;
	long empNumber;

	ConstructorOverloadingDemo() {
		System.out.println("In Default Constructor");
		empID = 1;
		empName = "Aj";
		empEmail = "ab@123.com";
		empNumber = 9028798555L;

	}

	ConstructorOverloadingDemo(int id, String name, String email, long no) {
		System.out.println("In Parameterized Constructor");
		this.empID = id;
		this.empName = name;
		this.empEmail = email;
		this.empNumber = no;

	}
	public String toString(){
		return "Employee " + empID + ":  " + empName + "  " + empEmail + "  " + empNumber;
	}

	public static void main(String[] args) {
		ConstructorOverloadingDemo obj = new ConstructorOverloadingDemo();
		System.out.println(obj);
		ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo(1,"Ajinkya","aj@gmail.com",1010101010L);
		System.out.println(obj1);

	}
}