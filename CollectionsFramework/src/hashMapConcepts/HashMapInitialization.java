package hashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import com.google.common.collect.ImmutableMap;

public class HashMapInitialization {

	public static Map<Integer, String> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put(1, "A");
		marksMap.put(2, "B");
	}
	
	public static void main(String[] args) {
		
		// 1. using HashMap class 
		
		HashMap<String, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		
		// 2. static way : static hashMap
		System.out.println(HashMapInitialization.marksMap.get(1));
		
		// 3. immutableMap with only one single entry 
		Map<String, Integer> map3 = Collections.singletonMap("test", 104);
		System.out.println(map3.get("test"));
//		map3.put("abc", 105);   // cannot add more than one entry 
		
		// 4. JDK 8 :
		// creating a 2D array of strings using stream and colletors 
		Map<String, String> map4 = Stream.of(new String[][] {
			{"Tom", "A Grade"},
			{"Pankaj", "A + Grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));
		
		
		// 5. using simpleEntry()
		
		Map<String, String> map5 = Stream.of(
				new AbstractMap.SimpleEntry<>("Pankaj", "Java"),
				new AbstractMap.SimpleEntry<>("Tom", "Python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map5.get("Pankaj"));
		map5.put("Jerry", "Golang");
		
		// 6. Map.of() method 
		// empty map : 
//		Map.of();
		Map<String, String> emptyMap = Map.of();
//		emptyMap.put("Lisa", "Mona");
//		System.out.println(emptyMap.get("Lisa"));
		
		// 7. map for keeping single value 
		Map<String, String> singletonMap = Map.of("k1","v1");
		System.out.println(singletonMap.get("k1"));
//		singletonMap.put("k2", "v2");
		
		// 8.  multi values map:: max 10 pairs of key-value
		Map<String, String> multiMap = Map.of("k1","v1","k2","v2","k3","v3");
		System.out.println(multiMap.get("k2"));
		
		// 9.
		// ofEntries method :: 
		// no limit on pairs (key-value)
		// Immutable map 
		Map<String, Integer> map7 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry<>("B", 200),
				new AbstractMap.SimpleEntry<>("C", 300)
				);
		System.out.println(map7.get("C"));
//		map7.put("D", 400);
		
		
		// maps using Guava ::
//		Map<String, String> titleMaps = ImmutableMap.of("Google", "Google", "Amazon", "Amazon Shopping");
		
		
	}
}
