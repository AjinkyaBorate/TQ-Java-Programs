package collections.Map.LabAssignments;

//3. WAP to create a LinkedHashMap which contains Integers as key and Strings as value.
//Print the map contents and observe the order. Don’t use generics
import java.util.LinkedHashMap;
import java.util.Map;

public class A3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");

		System.out.println(map);
	}
}
