package collections.List.ArrayList;

import java.util.ArrayList;

/*3. Create arraylist of characters. Remove duplicate characters from the list. 
 * E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’} */
public class A3 {
	public static void removeDuplicate(ArrayList<Character>ch) {
		//By simple for loop
//		for(int i=0;i<ch.size();i++) {
//			for(int j=i+1;j<ch.size();j++) {
//				if(ch.get(i)==ch.get(j)) {
//					ch.remove(j);
//					j--;
//				}
//			}
//		}
//		System.out.println(ch);
//		
		//by new list
		ArrayList<Character> clist = new ArrayList<Character>();
        for (Character c1 :ch) {
            if (!clist.contains(c1)) {
                clist.add(c1);
            }
        }

        System.out.println("List without duplicates: " + clist);
	}
	public static void main(String[] args) {
		ArrayList<Character> c=new ArrayList<Character>();
		c.add('d');
		c.add('g');
		c.add('h');
		c.add('d');
		c.add('d');
		c.add('h');
		c.add('g');

		removeDuplicate(c);
	}

}
