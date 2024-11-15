package collections.List.LinkedList.LabAssignments;
//2. WAP to join two linked lists.
import java.util.LinkedList;

public class HW_A2 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);

		list2.add(4);
		list2.add(5);
		list2.add(6);

		System.out.println("First LinkedList: " + list1);
		System.out.println("Second LinkedList: " + list2);

		list1.addAll(list2);

		System.out.println("Joined LinkedList: " + list1);
	}
}
