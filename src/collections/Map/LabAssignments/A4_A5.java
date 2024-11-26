package collections.Map.LabAssignments;

import java.util.TreeMap;

//4  WAP to search a key in a TreeMap.
//5 WAP to search a value in a TreeMap
public class A4_A5{

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(99, "V");
		tmap.put(909, "A");
		tmap.put(9, "J");
		tmap.put(20, "A");
		if(tmap.containsKey(9))System.out.println("Given key is present");
		else System.out.println("Givent key is not present in tmap");
		
		System.out.println("Returns true if key is present else false:  "+tmap.containsKey(9));
		System.out.println("Returns true if value is present else false:  "+tmap.containsValue("A"));
	}

}
