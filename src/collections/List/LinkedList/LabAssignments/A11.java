package collections.List.LinkedList.LabAssignments;

import java.util.LinkedList;

//11. WAP to display the elements and their positions in a linked list.
public class A11 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println("Position:"+i+" Value:"+list.get(i));
		}
	}

}
