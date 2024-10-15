package oops.inheritance;
//covariant return type
/*2. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
 *Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName()
 * method to include the employee's job title.
*/public class Persons {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.getEmplyeeID();

		Person p = new Emp();
		p.getFirstName();
		p.getLastName();
	}

}

class Person {
	public void getFirstName() {
		System.out.println("First Name: Ajinkya ");
	}

	public void getLastName() {
		System.out.println("Surname: Borate");
	}
}

class Emp extends Person {
	public void getEmplyeeID() {
		System.out.println("Employee ID: 123");
	}

	@Override
	public void getFirstName() {
		System.out.println("First Name: Abhi ");
	}

	@Override
	public void getLastName() {
		System.out.println("Surname: Anarse");
	}
}
