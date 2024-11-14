package collections.List.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		Vector<String> str = new Vector<>();
		str.add("Ajinkya");
		str.add("Ajinkya");
		str.add("Ajinkya");
		str.add("Ajinkya");
		System.out.println("By Enumeration: ");
		Enumeration<String> en = str.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println("By Iterator: ");
		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(str.capacity());

	}

}
