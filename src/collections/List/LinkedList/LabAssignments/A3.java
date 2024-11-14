package collections.List.LinkedList.LabAssignments;

import java.util.LinkedList;
import java.util.Scanner;

//3. WAP to iterate through all elements in a linked list starting at the specified position.
public class A3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start position:");
		int pos = sc.nextInt();
		sc.close();
		
		for (int i = pos - 1; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
