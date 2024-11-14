package collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List <Integer> l1=Arrays.asList(1,2,3,4,5);//one of way to create list
		ListIterator <Integer>itr= l1.listIterator();
		//For Forward Iteration
		while(itr.hasNext()) {
			System.out.print(itr.next()+",");
		}
		System.out.println();
		//For Backward Iteration
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+",");
		}
		
	}

}
