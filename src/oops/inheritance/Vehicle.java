package oops.inheritance;

/*1.Create a program where we have a base class Vehicle and a sub class Car inherits the property of Vehicle
Also show the use of super keyword in this code.
*/
public class Vehicle {

	String brand;
	int noofWheels;
	int speed;
	String fuelType;

	public Vehicle(String brand, int noofWheels, int speed, String fuelType) {
		this.brand = brand;
		this.noofWheels = noofWheels;
		this.speed = speed;
		this.fuelType = fuelType;
		
	}

	public String toString() {
		return "Brand: " + brand + "\nNumber of Wheels: " + noofWheels + "\nSpeed: " + speed + "kmph" + "\nFuel Type: "
				+ fuelType;
	}
}
