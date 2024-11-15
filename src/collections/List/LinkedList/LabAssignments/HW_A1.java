package collections.List.LinkedList.LabAssignments;

//1. WAP to shuffle the elements in a linked list.
import java.util.Collections;
import java.util.LinkedList;

public class HW_A1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("Original LinkedList: " + list);

		Collections.shuffle(list);

		System.out.println("Shuffled LinkedList: " + list);
	}

}
