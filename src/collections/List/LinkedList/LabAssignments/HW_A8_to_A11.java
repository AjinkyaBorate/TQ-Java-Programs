package collections.List.LinkedList.LabAssignments;

import java.util.ArrayList;
import java.util.LinkedList;

/*
8. WAP to convert a linked list to array list.
9. WAP to compare two linked lists.
10. WAP to test a linked list is empty or not.
11. WAP to replace an element in a linked list.
*/
public class HW_A8_to_A11 {

	public static void main(String[] args) {
		LinkedList<Integer> List = new LinkedList<>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);

		ArrayList<Integer> arrayList = new ArrayList<>(List);
		System.out.println("ArrayList: " + arrayList);

		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		System.out.println(list2);

		if (list1.equals(list2)) {
			System.out.println("Both linked lists are equal.");
		} else {
			System.out.println("Linked lists are not equal.");

		}

		if (list1.isEmpty()) {
			System.out.println("The linked list is empty.");
		} else {
			System.out.println("The linked list is not empty.");

		}
		List.set(3, 99);
		System.out.println(List);
	}

}
