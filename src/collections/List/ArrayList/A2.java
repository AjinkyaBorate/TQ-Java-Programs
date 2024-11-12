package collections.List.ArrayList;

import java.util.ArrayList;

//2.Create arraylist of 10 integers. Insert an element at 7th position.
public class A2 {

	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<Integer>();
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		n.add(16);
		n.add(17);
		n.add(18);
		n.add(19);
		n.add(20);
		System.out.println("AL: "+n);
		n.add(6, 22);
		System.out.println("After insertion: "+n);
	}

}
