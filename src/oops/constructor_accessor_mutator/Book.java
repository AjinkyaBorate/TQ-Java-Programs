package oops.constructor_accessor_mutator;

public class Book {
	private int id;
	private String name;
	private double price;

	public void insert(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public void display() {
		System.out.println("Book id is : " + id);
		System.out.println("Book name is : " + name);
		System.out.println("Price of book is : Rs " + price);

	}

	public static void main(String[] args) {
		Book obj = new Book();
		obj.insert(123, "Pirates of the Caribbean", 5000.0);
		obj.display();
	}

}
