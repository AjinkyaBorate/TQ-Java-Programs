package collections.List.ArrayList;

import java.util.ArrayList;

public class A9_10 {

	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<Integer>();
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		System.out.println(n);
		n.remove(3);
		System.out.println(n);
		n.removeAll(n);
		System.out.println(n);
		
		
	}

}
