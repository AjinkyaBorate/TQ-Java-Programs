package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Teams {
	public static HashMap<String, Integer> createHashMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Kings", 99);
		map.put("Warriors", 88);
		map.put("Masters", 67);
		map.put("Victory", 90);
		return map;
	}

	public static void totalScore(HashMap<String, Integer> map) {
		Set<Entry<String, Integer>> entry = map.entrySet();
		int sum = 0;
		for (Entry<String, Integer> e : entry) {
			if (e.getValue() > 0) {
				sum = sum + e.getValue();
			}

		}
		System.out.println("Sum of scores of all teams: " + sum);
	}

	public static void maxTeamScore(HashMap<String, Integer> map) {
		Set<Entry<String, Integer>> entry = map.entrySet();
		int max = 0;
		String maxteam="";
		for (Entry<String, Integer> e : entry) {
			if (e.getValue() > max) {
				max=e.getValue();
				maxteam=e.getKey();
			}
		}
		System.out.println("Team with max Score is "+maxteam+" with score "+max);
	}
	public static void greatethan(HashMap<String, Integer> map) {
		Set<Entry<String, Integer>> entry = map.entrySet();
		System.out.println("Team with score greater than 70 are: ");
		for (Entry<String, Integer> e : entry) {
			if (e.getValue() > 70) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		HashMap<String, Integer> hm = createHashMap();
		totalScore(hm);
		maxTeamScore(hm);
		greatethan(hm);
	}

}
