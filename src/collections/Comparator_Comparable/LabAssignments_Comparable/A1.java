package collections.Comparator_Comparable.LabAssignments_Comparable;

import java.util.ArrayList;
import java.util.Collections;

/*1. WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using
Collections.sort(list) method. Print ArrayList.*/
public class A1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Html");
		al.add("Css");
		al.add("SQL");
		al.add("Python");
		al.add("Java");
		System.out.println("Before sort:"+al);
		Collections.sort(al);
		System.out.println("After sort:"+al);
		
		
 	}

}
