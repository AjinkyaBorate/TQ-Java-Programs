package oops.inheritance;
/*1.Create a program where we have a base class Vehicle and a sub class Car inherits the property of Vehicle
Also show the use of super keyword in this code.
*/
public class Car extends Vehicle {
	String model;

	public Car(String brand, int noofWheels, int speed, String fuelType, String model) {
		super(brand, noofWheels, speed, fuelType);
		this.model = model;
	}

	public String toString() {
		return super.toString() + "\nModel: " + model;
	}

	public static void main(String[] args) {
		Car obj = new Car("Toyoto", 4, 200, "Diesel", "Fortuner");
		System.out.println(obj);
	}

}
