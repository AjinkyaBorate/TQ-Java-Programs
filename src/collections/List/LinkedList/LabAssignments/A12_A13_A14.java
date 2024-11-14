package collections.List.LinkedList.LabAssignments;

import java.util.LinkedList;

public class A12_A13_A14 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
//12. WAP to remove a specified element from a linked list.
		list.remove(0);
		System.out.println(list);
//13. WAP to remove first and last element from a linked list.
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
//14. WAP to remove all the elements from a linked list
		list.clear();
		System.out.println(list);
	}

}
