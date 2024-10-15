package oops.constructor_accessor_mutator;

public class ProductData {

	private int id;
	private String name;
	private String brand;
	private double actualPrice;
//	private double discPrice;

	public void insert(int i, String n, String b, double ap) {
		id = i;
		name = n;
		brand = b;
		actualPrice = ap;
//		discPrice=dp;
	}

	public void display() {

		double discPrice = actualPrice - (actualPrice * 10 / 100);
		System.out.println("Product id: " + id);
		System.out.println("Product name: " + name);
		System.out.println("Product brand: " + brand);
		System.out.println("Product Original Price: " + actualPrice);
		System.out.println("Price after discount: " + discPrice);

	}

	public static void main(String[] args) {
		ProductData obj = new ProductData();
		obj.insert(100, "Smartphone", "realme", 30000.0);
		obj.display();

	}

}
