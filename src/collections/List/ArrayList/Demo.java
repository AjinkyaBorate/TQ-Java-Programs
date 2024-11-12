package collections.List.ArrayList;

import java.util.ArrayList;

public class Demo {

	public static void searchElement(ArrayList<Integer> a,int n) {
		for(int i=0;i<a.size();i++) {
			if(n==a.get(i)) {
				System.out.println("Element found at: "+i);
				break;
			}
		}
		
		if(a.contains(n)) {
			System.out.println("Element found in arraylist");
		}else {
			System.out.println("not found");
		}
	}
	
	public static void maxOfArrayList(ArrayList<Integer>aii) {
		int max=0;
		for(int i=0;i<aii.size();i++) {
			if(aii.get(i)>max) {
				max=aii.get(i);
			}
		}
		System.out.println("Max is: "+max);
	}
	
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// using ArrayList without generic
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("java");
		al.add("true");
		al.add(34.22);
		al.add(84849403022222l);
		al.add(3.124f);
		System.out.println(al);//it print using toString method
		Long l = (Long) al.get(4);

		// List Using generic
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(12);
		ai.add(11);
		ai.add(2);
		ai.add(22);
		ai.add(222);
		ai.add(33);
		
		System.out.println(ai);
		ai.add(2, 111);
		System.out.println(ai);
		ai.remove(1);
		System.out.println(ai);
		
		searchElement(ai,1244);
		maxOfArrayList(ai);
	}

}
