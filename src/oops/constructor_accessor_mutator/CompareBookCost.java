package oops.constructor_accessor_mutator;
//2.Create a class Book with the following details : id, name , price, category
//Create methods to calDiscount(), compareDiscCost() 
//Create 4 objects of books by taking the user input and then compare the cost of any 2 books
public class CompareBookCost {
	int id;
	String name;
	double price;
	String category;
	
	CompareBookCost(int id, String name, double price, String category) {
		//constructor
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
		}

	public void calDiscount() {
		price=price-(price*10/100);
	}

	public void compareDiscount(CompareBookCost obj) {
		if(this.price>obj.price) {
			System.out.println("Book "+this.id+" cost more than Book "+obj.id);
		}else {
			System.out.println("Book "+obj.id+" cost more than Book "+this.id);
		}
	}
	public void display() {
		System.out.println("Id: "+id+" Name: "+name+" Category: "+category+" Discount Price:"+price);
	}

	public static void main(String[] args) {
		
		CompareBookCost obj1 = new CompareBookCost(1,"A",100.0,"x");
		CompareBookCost obj2 = new CompareBookCost(2,"B",150.0,"y");
		CompareBookCost obj3 = new CompareBookCost(3,"C",300.0,"z");
		CompareBookCost obj4 = new CompareBookCost(4,"D",400.0,"w");
		
		obj1.calDiscount();
		obj2.calDiscount();
		obj3.calDiscount();
		obj4.calDiscount();

		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();

		obj1.compareDiscount(obj2);
		obj3.compareDiscount(obj4);
		obj1.compareDiscount(obj3);
		obj1.compareDiscount(obj4);


	}

}
