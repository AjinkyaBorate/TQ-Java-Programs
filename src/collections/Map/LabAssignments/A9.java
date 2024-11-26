package collections.Map.LabAssignments;

import java.util.HashMap;
import java.util.Map.Entry;

/*Write a program to create a hashmap as follows.
a. A hashmap ‘oldMap’ has multiple duplicate values. Write a
program to create new hashmap ‘newMap’ which contains
keys as unique values of ‘oldMap’ and values as count of
number of times value has appeared in ‘map’.
b. e.g oldMap = (1, ‘a’) , (2,’b’), (3,’c’), (4,’b’), (5,’a’), (6,’a’),
i. newMap = {‘a’,3) , (‘b’,2),(‘c’,1);*/
public class A9 {
	public static HashMap<Character, Integer> countFreqOfEachChar(HashMap<Integer, Character> map) {
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (Entry<Integer, Character> entry : map.entrySet()) {
			Character value = entry.getValue();
			if (mp.containsKey(value)) {
				mp.put(value, mp.get(value) + 1);
			} else {
				mp.put(value, 1);
			}
		}
		return mp;

	}

	public static void main(String[] args) {
		HashMap<Integer, Character> oldMap = new HashMap<Integer, Character>();
		oldMap.put(1, 'a');
		oldMap.put(2, 'b');
		oldMap.put(3, 'c');
		oldMap.put(4, 'b');
		oldMap.put(5, 'a');
		oldMap.put(6, 'a');
		HashMap<Character, Integer> newmap = countFreqOfEachChar(oldMap);
		System.out.println(newmap);

	}

}
