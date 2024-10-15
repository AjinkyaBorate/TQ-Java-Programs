package oops.statickeyword;

/*Write a Car class with following datamember model,price,fueltype,registrationnumber,static datamember : totalSales,toRevenue 
Write appropriate constructors ,methods - show ,sales static method :getTotalSales,getTotalRevenue
Write main method -create Car class object ,invoke sales method .call getTotalRevenue and getTotalSales method to find total sales and revenue.
*/
public class Car {

	String model;
	double price;
	String fuelType;
	String registrationNumber;
	static int totalSales = 0;
	static double totalRevenue = 0;

	Car(String model, double price, String fuelType, String registrationNumber) {
		this.model = model;
		this.price = price;
		this.fuelType = fuelType;
		this.registrationNumber = registrationNumber;
	}

	public void show() {
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Registration Number: " + registrationNumber);
		System.out.println();
	}

	public void sales() {
		totalSales++;
		totalRevenue += price;
	}

	public static int getTotalSales() {
		return totalSales;
	}

	public static double getTotalRevenue() {
		return totalRevenue;
	}

	public static void main(String[] args) {
		Car car1 = new Car("Hyundai Creta", 800000, "Petrol", "MH12AB1234");
		Car car2 = new Car("Tata Nexon", 1200000, "Diesel", "MH12AC1234");
		Car car3 = new Car("Kia Seltos", 1500000, "Electric", "MH12YZ1234");
		Car car4 = new Car("Honda City", 1000000, "CNG", "MH12XY1234");

		car1.show();
		car2.show();
		car3.show();
		car4.show();

		
		car1.sales();
		car2.sales();
		car3.sales();
		car4.sales();

		System.out.println();
		System.out.println("Total Sales: " + Car.getTotalSales());
		System.out.println("Total Revenue: Rs." + Car.getTotalRevenue());
	}
}
