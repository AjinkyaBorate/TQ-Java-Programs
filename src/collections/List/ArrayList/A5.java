package collections.List.ArrayList;

import java.util.ArrayList;

//5. WAP to search an element from ArrayList
public class A5 {
	
	public static void searchElement(ArrayList<Integer> a, int n) {
		//by for loop
		for (int i = 0; i < a.size(); i++) {
			if (n == a.get(i)) {
				System.out.println("Element found at index: " + i);
				break;
			}
		}
		//by contains method
		if(a.contains(n)) {
			System.out.println("Element found in arraylist");
		}else {
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(12);
		ai.add(11);
		ai.add(2);
		ai.add(22);
		ai.add(222);
		ai.add(33);

		searchElement(ai, 222);
	}

}
