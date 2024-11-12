package collections.List.ArrayList;

import java.util.ArrayList;

//WAP to create a new ArrayList, add some colors (string) and print the collection.
public class A8 {

	public static void main(String[] args) {
		ArrayList<String> cls = new ArrayList<String>();

		cls.add("Red");
		cls.add("Black");
		cls.add("Green");
		cls.add("Blue");

		System.out.println("Colours in arraylist: " + cls);
	}

}
