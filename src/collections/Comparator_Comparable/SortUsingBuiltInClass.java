package collections.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingBuiltInClass {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(31);
		n.add(12);
		n.add(13);
		n.add(54);
		n.add(15);
		n.add(56);
		System.out.println("Before Sorting: ");
		System.out.println(n);

//		Collections.sort(n);
//		System.out.println("After Sorting(Ascending): ");// By default Ascending order
//		System.out.println(n);
//
//		Collections.reverse(n);// for descending order u need to reverse ascending list
//		System.out.println("After Sorting:(Descending)");
//		System.out.println(n);
		
		
		IntegerSorting i=new IntegerSorting();
		Collections.sort(n, i);
		System.out.println("\nSort using comparator(Ascending)");
		System.out.println(n);
	}

}

class IntegerSorting implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		//System.out.println("In Integer sorting compare()");
		if (o1 == o2)
			return 0;
		else if (o1 > o2)
			return 1;
		else
			return -1;
	}

}
