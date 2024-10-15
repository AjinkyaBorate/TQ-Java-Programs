package oops.containments;
//Containments using constructor/toString
public class Book {

		private int id;
		private String name;
		private double price;
		Author aname;

		Book(int id, String name, double price,Author aname) {
			this.id = id;
			this.name = name;
			this.price = price;
			this.aname=aname;

		}

		public String toString() {
			return "Name: "+name+" Id: "+id+" Author name: "+aname+" Price: "+price;
		}

		public static void main(String[] args) {
			Author a1=new Author("ABC");
			Book obj = new Book(123, "Pirates of the Caribbean", 5000.0,a1);
			System.out.println(obj);
		}
	}

