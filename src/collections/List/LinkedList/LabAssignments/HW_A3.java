package collections.List.LinkedList.LabAssignments;
//3. WAP to clone a linked list to another linked list.

import java.util.LinkedList;

public class HW_A3 {
	public static void main(String[] args) {
		LinkedList<Integer> List = new LinkedList<>();

		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);

		System.out.println("Original LinkedList: " + List);

		@SuppressWarnings("unchecked")
		LinkedList<Integer> clonedList = (LinkedList<Integer>) List.clone();

		System.out.println("Cloned LinkedList: " + clonedList);
	}
}
