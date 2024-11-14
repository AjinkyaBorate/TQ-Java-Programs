package collections.List.LinkedList.LabAssignments;

import java.util.Iterator;
import java.util.LinkedList;

//2. WAP to iterate through all elements in a linked list.
public class A2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		System.out.println("Iteration by For Each: ");
		for (String st : list) {
			System.out.print(st+" ");
		}
		System.out.println("\nIteration by Iterator:");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+" ");
		}

	}

}
