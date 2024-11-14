package collections.Comparator_Comparable.LabAssignments_Comparable;

import java.util.ArrayList;
import java.util.Collections;

/*2. WAP to sort the elements of List that contains Integer objects.Print ArrayList.Sort using
Collections.sort(list) method.Print ArrayList.
Note: In the above 2 assignments, sorting is achieved automatically as String as well as Wrapper
class Integer implements Comparable interface method compareTo.*/
public class A2 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(11);
		al.add(8);
		
		System.out.println("Before sort:"+al);
		Collections.sort(al);
		System.out.println("After sort:"+al);
		


		

	}

}
