package collections.List.ArrayList;
//WAP to iterate through all elements in an ArrayList using for each

import java.util.ArrayList;

public class A7 {
	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		System.out.println("Original List: " + n);

		for (Integer m:n) {
			System.out.print(m+" ");
		}
		
	}
}