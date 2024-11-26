package collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> chm = new ConcurrentHashMap<>();
		chm.put("1", "2");
		chm.put("2", "2");
		chm.put("3", "2");
		chm.put("4", "2");
		System.out.println("Concurrent hashmap before iteration:" + chm);
		Iterator<String> itr = chm.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			if (key.equals("3"))
				chm.put(key + "new", "new3");
		}
		System.out.println("Concurrent hashmap after iteration:" + chm);
		
		
		// HashMap

		chm = new HashMap<String, String>();
		chm.put("1", "1");
		chm.put("2", "1");
		chm.put("3", "1");
		chm.put("4", "1");
		chm.put("5", "1");
		chm.put("6", "1");
		System.out.println("HashMap before iterator: " + chm);
		Iterator<String> it1 = chm.keySet().iterator();

		while (it1.hasNext()) {
			String key = it1.next();
			if (key.equals("3"))
				chm.put(key + "new", "new3");//cancont modify hashmap during iteration it will throw exception
		}
		System.out.println("HashMap after iterator: " + chm);
	}

}
