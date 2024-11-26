package collections.Map.LabAssignments;

import java.util.HashMap;
import java.util.LinkedHashMap;

//1. WAP to copy a HashMap content to another LinkedHashMap 
public class A1 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(99,"Ajinkya");
		map.put(88,"Abhi");
		map.put(909,"Arush");
		map.put(67,"Pratik");
		System.out.println(map);
		
		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<>();
		lmap.putAll(map);
		System.out.println(lmap);
		
	}

}
