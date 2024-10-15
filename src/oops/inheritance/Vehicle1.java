package oops.inheritance;

/*A vehicle has four wheels and a color assigned to it.
 A car is a vehicle with a seating capacity of four.
 An SUV is a car which has a 800 horsepower engine. Create a model detailing the same.
*/
public class Vehicle1 {
	static int noofwheels = 4;
	String color;
	String seatingCap;
	String type;
	int power;

	public Vehicle1 (String color,String seatingCap,String type,int power) {
		this.color=color;
		this.seatingCap=seatingCap;
		this.type=type;
		this.power=power;
	}
	public String toString() {
		return "Color: "+color+" Seating Capacity: "+seatingCap+" Type of Vehicle: "+type+" Vehicle Power: "+power+" Number of Wheels: "+noofwheels;
	}
}
