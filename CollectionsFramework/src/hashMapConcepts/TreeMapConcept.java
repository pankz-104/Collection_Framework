package hashMapConcepts;

import java.util.*;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1, "tom");
		map.put(2, "peter");
		map.put(4, "pankaj");
		map.put(5000, "pandey");
		map.put(3, "jerry");
		
		System.out.println(map);
		
		map.forEach((k, v) -> System.out.println("key = "+k+" value = "+v));
		
		System.out.println(map.lastKey());
		System.out.println(map.firstEntry());
		System.out.println(map.firstKey());
		
		Set<Integer> keysLessThan3k = map.headMap(3000).keySet();
		System.out.println(keysLessThan3k);
		
		Set<Integer> greaterThan3k = map.tailMap(3000).keySet();
		System.out.println(greaterThan3k);
		
		TreeMap<String, Integer> userMap = new TreeMap<>();
		userMap.put("James", 100);
		userMap.put("Kelvin", 222);
		userMap.put("Albert", 102);
		userMap.put("Edison", 300);
		userMap.put("Thomas", 111);
		
		userMap.forEach((k, v) -> System.out.println("key = "+k+" value = "+v));
		
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(Comparator.reverseOrder());
		map1.put("Pankaj",50);
		map1.put("Sandesh", 2);
		map1.put("Abyakta", 3);
		
		System.out.println(map1);
	}
}