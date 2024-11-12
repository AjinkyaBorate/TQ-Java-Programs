package collections.List.ArrayList;
import java.util.ArrayList;

// WAP to iterate through all elements in an ArrayList using for loop
public class A6 {

	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<Integer>();
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		System.out.println("Original List: "+n);
		
		for(int i=0;i<n.size();i++) {
			System.out.print(n.get(i)+" ");
		}
	}

}
