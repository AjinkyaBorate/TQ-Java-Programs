package collections.List.LinkedList.LabAssignments;

import java.util.LinkedList;

//1. WAP to append the specified element to the end of a linked list.
public class A1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);

		list.addLast("Last");
		System.out.println(list);
		
		list.offerLast("x");		
		System.out.println(list);

		
	}

}
