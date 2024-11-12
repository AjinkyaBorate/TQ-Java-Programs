package collections.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCustomerNameByComparator {
	public static ArrayList<Customer> createArrayList() {
		ArrayList<Customer> custlist = new ArrayList<Customer>();
		Customer c = new Customer(1, "Abhi", "a@gmail.com");
		custlist.add(c);
		Customer c1 = new Customer(22, "Pratik", "p@gmail.com");
		custlist.add(c1);
		Customer c2 = new Customer(2, "Bhushan", "b@gmail.com");
		custlist.add(c2);
		Customer c3 = new Customer(33, "Carry", "c@gmail.com");
		custlist.add(c3);
		

		return custlist;
	}
	public static void printUsingForEach(ArrayList<Customer> custlist) {
		for (Customer c : custlist) {
			System.out.println(c.toString());
		}
	}
	public static void main(String[] args) {
		ArrayList<Customer> arrlist = createArrayList();
		System.out.println("Before Sort: ");
		printUsingForEach(arrlist);

		Collections.sort(arrlist, new custNameComparator());
		System.out.println("\nAfter Sorting by Name using Comparator");
		printUsingForEach(arrlist);
		
		System.out.println("\nAfter Sorting by ID using Comparable");
		Collections.sort(arrlist);
		printUsingForEach(arrlist);
	}

}
class custNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.name.compareTo(o2.name);
	}

}
