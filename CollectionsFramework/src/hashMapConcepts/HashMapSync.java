package hashMapConcepts;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
	public static void main(String [] args) {
		
		// synchronizedMap method in collections class :: 
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "A");
		map1.put("2", "B");
		
		// create synchronizedMap :: 
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		// ConcurrenthashMap :: 
		// it does not throw any ConcurrentModificationException
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("3", "C");
		concurrentMap.put("4", "D");
		concurrentMap.put("5", "E");
		System.out.println(concurrentMap.get("3"));
		
	}
}
