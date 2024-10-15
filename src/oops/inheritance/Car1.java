package oops.inheritance;
/*A vehicle has four wheels and a color assigned to it.
A car is a vehicle with a seating capacity of four.
An SUV is a car which has a 800 horsepower engine. Create a model detailing the same.
*/
public class Car1 extends Vehicle1 {
	String model;
	public Car1(String color,String seatingCap,String type,int power,String model) {
		super(color,seatingCap,type,power);
		this.model=model;
	}
	public String toString() {
		return super.toString()+" Model: "+model;
	}
	public static void main(String[] args) {
		Car1 obj=new Car1("Black", "Four","SUV",800, "XYZ");
		System.out.println(obj);
	}

}
