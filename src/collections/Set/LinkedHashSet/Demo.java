package collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(12);
		lhs.add(13);
		lhs.add(14);

		System.out.println("LHS: "+lhs);
	}

}
