package collections.Map.LabAssignments;
//2. WAP to delete all elements from a given LinkedHashMap 
import java.util.LinkedHashMap;

public class A2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<>();
		lmap.put(99,"Ajinkya");
		lmap.put(88,"Abhi");
		lmap.put(909,"Arush");
		lmap.put(67,"Pratik");
		System.out.println(lmap);
		lmap.clear();
		System.out.println(lmap);
	}

}
