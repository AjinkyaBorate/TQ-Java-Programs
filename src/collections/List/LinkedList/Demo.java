package collections.List.LinkedList;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("abc");
		list.add("ab");
		list.add("ac");
		list.add("bc");
		list.add("c");
		System.out.println(list);

		list.addFirst("First");
		list.addLast("Last");		
		System.out.println(list);
		
		list.set(1, "a");
		System.out.println(list);

		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

		
		list.remove(0);
		System.out.println(list);
		
		list.offerFirst("ac");
		list.offerLast("ab");
		list.offer("bb");
		System.out.println(list);

		list.peek();
		list.peekFirst();
		list.peekLast();
		
		list.pop();
		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.get(1));

		
	}
}
