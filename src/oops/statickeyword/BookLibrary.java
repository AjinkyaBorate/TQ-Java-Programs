package oops.statickeyword;

public class BookLibrary {
	int id;
	String name;
	double price;
	String category;
	static String supplier="Mr XYZ";
	static int count;
	
	BookLibrary(int id,String name,double price,String category) {
		count++;
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
	}
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
		System.out.println("Supplier Name: "+supplier);
		System.out.println();

	}
	public static void showLibrayrDetails() {
		
		System.out.println("Supplier Name: "+supplier);
		System.out.println("Number of books: "+count);
		System.out.println("Book Detail: ");
		System.out.println();


	}
	
	public static void main(String[] args) {
		showLibrayrDetails();
		
		BookLibrary obj=new BookLibrary(1,"Java Book",200.0,"Programming");
		BookLibrary obj1=new BookLibrary(2,"Python Book",300.0,"Programming");
		BookLibrary obj2=new BookLibrary(3,"C Book",250.0,"Programming");
		BookLibrary obj3=new BookLibrary(4,"SQL Book",350.0,"Programming");
		
		obj.display();		
		obj1.display();
		obj2.display();
		obj3.display();


	}

}
