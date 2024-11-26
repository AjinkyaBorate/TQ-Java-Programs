package collections.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("D");
		System.out.println(al);
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("A");
		System.out.println(hs);
		
		boolean b=hs.contains("A");
		System.out.println(b);
		
		System.out.println(hs.isEmpty());
		
		hs.remove("A");
		System.out.println(hs);
		
		//hs.removeAll(hs);
		hs.clear();
		System.out.println(hs);

	}
}
