package collections.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DemoFirst {

	public static void main(String[] args) {
		// HashMap
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ajinkya");
		map.put(2, "Abhi");
		map.put(3, null);
		System.out.println(map);
		// LinkedHashMap
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(111, "Java");
		lmap.put(101, null);
		lmap.put(201, null);
		System.out.println(lmap);

	}

}
