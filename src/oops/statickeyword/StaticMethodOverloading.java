package oops.statickeyword;

public class StaticMethodOverloading {
	
	public static void display() {
		
	}
	public static void display(String name) {
		
	}
	public static void main(String[] args) {
		System.out.println("Hi");
	}
	public static void main(String surname) {
		System.out.println("surname");
	}

}
