package collections.List.LinkedList.LabAssignments;

import java.util.LinkedList;

/*
4. WAP to remove and return the first element of a linked list.
5. WAP to retrieve but does not remove, the first element of a linked list.
6. WAP to retrieve but does not remove, the last element of a linked list.
*/
public class HW_A4_to_A7 {
	public static void main(String[] args) {
		LinkedList<Integer> List = new LinkedList<>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);
		System.out.println(List);
		List.remove();
		System.out.println(List);
		System.out.println("First: " + List.getFirst());

		System.out.println("Last: " + List.getLast());
		
		//7. WAP to check if a particular element exists in a linked list.
		if (List.contains(20)) {
			System.out.println("Element exists in the LinkedList.");
		} else {
			System.out.println("Element does not exist in the LinkedList.");
		}
	}
}
