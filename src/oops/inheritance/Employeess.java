package oops.inheritance;

/*1. Create a employee class , create a method getInstance() which return a new Employee, 
 * Now create a Manager class and override getInstance() method which return new Manager(). 
 * Show the details of Employee and Manager returned
2.Create a class Car which has a method displayDetails() whose return type is Car
Now create a class SUV which has overriden displayDetails()
Show the usage of Covariant return type in this code*/
class Employeee{
	int id;
	String name;
	public Employeee getInstance() {
		System.out.println("In Employee Class");
		return new Employeee();
	}
}
class Managerr extends Employeee{
	
	public Managerr getInstance() {
		System.out.println("In Manager Class");
		return new Managerr();
		
	}
}
public class Employeess {

	public static void main(String[] args) {
		Employeee e=new Employeee();
		e.getInstance();
		
		Managerr m=new Managerr();
		m.getInstance();	
	}

}