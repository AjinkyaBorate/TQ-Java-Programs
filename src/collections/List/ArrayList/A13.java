package collections.List.ArrayList;

import java.util.ArrayList;

//WAP to test an ArrayList is empty or not
public class A13 {
	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
//		n.add(11);
//		n.add(12);
//		n.add(13);
//		n.add(14);
//		n.add(15);
		
		if(n.size()==0) {
			System.out.println("ArrayList empty");
		}else {
			System.out.println(n);
		}
		
		if(n.isEmpty())	System.out.println("ArrayList empty");
		else System.out.println(n);

		
	}
}