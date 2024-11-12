package collections.List.ArrayList;

import java.util.ArrayList;

public class A11 {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(11);
		m.add(12);
		m.add(20);
		
		n.retainAll(m);

		System.out.println(n);
	}

}
