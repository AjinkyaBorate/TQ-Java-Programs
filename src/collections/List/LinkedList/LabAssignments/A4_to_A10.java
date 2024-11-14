package collections.List.LinkedList.LabAssignments;

import java.util.LinkedList;
import java.util.ListIterator;

public class A4_to_A10 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
//4. WAP to iterate a linked list in reverse order.
		System.out.println("Reverse order using listiterator:");
		ListIterator<String> litr = list.listIterator(list.size());
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}

//5.WAP to insert the specified element at the specified position in the linked list.
		System.out.println("\nQ.5");
		list.set(2, "f");
		System.out.println(list);

//6. WAP to insert elements into the linked list at the first and last position.
		list.addFirst("First");
		list.addLast("Last");
		System.out.println(list);
//7. WAP to insert the specified element at the front of a linked list.
		list.addFirst("First");
		System.out.println(list);
//8. WAP to insert the specified element at the end of a linked list.
		list.addLast("Last");
		System.out.println(list);
//9. WAP to insert some elements at the specified position into a linked list.
		System.out.println("\n");
		list.set(4, "g");
		System.out.println(list);
//10.WAP to get the first and last occurrence of the specified elements in a linked list.
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());

	}

}
