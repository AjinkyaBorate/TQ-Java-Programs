package oops.inheritance;

/*
 * Create a class Car which has a method displayDetails() whose return type is Car
Now create a class SUV which has overriden displayDetails()
Show the usage of Covariant return type in this code*/
public class Car2 {

	public static void main(String[] args) {
		Carr c = new Carr(1, "Fortuner");
		c.displayDetails();
		Suv s = new Suv(2, "Ford", "Black");
		s.displayDetails();
	}

}

class Carr {
	int id;
	String name;

	Carr(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Carr displayDetails() {
		System.out.println("Car Number: " + id);
		System.out.println("Car Name: " + name);
		return this;
	}
}

class Suv extends Carr {
	String color;

	Suv(int id, String name, String color) {
		super(id, name);
		this.color = color;
	}

	public Suv displayDetails() {
		super.displayDetails();
		System.out.println("Color: " + color);
		return this;
	}
}
