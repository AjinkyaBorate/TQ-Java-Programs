package collections.Map.HashMap;
import java.util.HashMap;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// Map<String,Integer>map=new HashMap<String, Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Ajinkya", 99);
		map.put("Abhi", 88);
		map.put("Arush", 67);
		map.put("Pratik", 90);

		System.out.println(map);

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Dipak", 33);
		map1.put("Krushna", 55);

		// putAll
		map.putAll(map1);
		System.out.println(map);
		
		// remove using key
		map.remove("Arush");
		System.out.println(map);
		
		// remove using value
		map.remove("Abhi", 88);
		System.out.println(map);
		
		// keySet() returns keys in set form
		Set<String> keyset = map.keySet();
		System.out.println(keyset);
		
		//get(Object key) to get value of specified key
		System.out.println(map.get("Ajinkya"));
		
		//putIfAbsent() put V if absent specified key is absent
		map.putIfAbsent("Avi", 98);
		System.out.println(map);
		
		//containsKey() return true if K is present
		System.out.println(map.containsKey("Avi"));
		//clear map
		map.clear();
		System.out.println(map);

	}

}
