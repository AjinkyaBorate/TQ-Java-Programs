package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
	public static HashMap<String, Integer> createHashMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Ajinkya", 99);
		map.put("Abhi", 88);
		map.put("Arush", 67);
		map.put("Pratik", 90);
		return map;
	}

	public static void printUsingKeySetandIterator(HashMap<String, Integer> map) {
		System.out.println("Print Using KeySet and Iterator: ");
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + ":" + map.get(key));
		}
	}

	public static void printUsingEntrySetandIterator(HashMap<String, Integer> map) {
		System.out.println("Print Using EntrySet and Iterator: ");
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entry.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());//this is also possible
			Entry<String, Integer> e = itr.next();
			// System.out.println(e);//if there is no need of key and value separately
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

	public static void printUsingKeySetandEnhancedForLoop(HashMap<String, Integer> map) {
		System.out.println("Print Using keySet and Enhanced For Loop: ");
		Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(s + ":" + map.get(s));
		}
	}

	public static void printUsingEntrySetandEnhancedForLoop(HashMap<String, Integer> map) {
		System.out.println("Print Using EntrySet and Enhanced For Loop: ");
		Set<Entry<String, Integer>> entry = map.entrySet();
		for (Entry<String, Integer> e : entry) {
			// System.out.println(e);
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

	public static void main(String[] args) {
		HashMap<String, Integer> hm = createHashMap();
		printUsingKeySetandIterator(hm);
		System.out.println();
		printUsingEntrySetandIterator(hm);
		System.out.println();
		printUsingKeySetandEnhancedForLoop(hm);
		System.out.println();
		printUsingEntrySetandEnhancedForLoop(hm);
		System.out.println();
	}

}
