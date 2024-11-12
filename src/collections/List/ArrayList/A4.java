package collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//4. WAP to reverse elements in an ArrayList 
public class A4 {
	public static void reverseArrayList(ArrayList<Integer> m) {
		//Reverse Elements
		System.out.print("Reversed elements: ");
		for (int i = m.size() - 1; i >= 0; i--) {
			System.out.print(m.get(i) + " ");
		}
		
		//Reverse ArrayList using built in method
		Collections.reverse(m);
		System.out.println("\n"+m);
		
		//Using New ArrayList
//		ArrayList<Integer> reversedList = new ArrayList<>();
//        for (int i = m.size() - 1; i >= 0; i--) {
//            reversedList.add(m.get(i));
//        }
//        System.out.println(reversedList);
	}

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		reverseArrayList(n);
		System.out.println();
		}

}
