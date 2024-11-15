package collections.Map.HashMap;
//Create an arraylist {'a','b','a','b','a','c'}. Create map from it where Key is the element and the frequency is value
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AL_Map {
	public static HashMap<Character, Integer> findFrequency(List<Character> alist) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Iterator<Character> itr = alist.iterator();
		while (itr.hasNext()) {
			Character ch = itr.next();
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, (val + 1));
			} else {
				map.put(ch, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		List<Character> alist = new ArrayList<>();
		alist.add('a');
		alist.add('b');
		alist.add('a');
		alist.add('b');
		alist.add('a');
		alist.add('c');

		System.out.println("Original ArrayList: " + alist);

		HashMap<Character, Integer> map = findFrequency(alist);
		System.out.println("Map of char and its freq:" + map);
	}

}
