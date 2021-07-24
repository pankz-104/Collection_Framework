package hashMapConcepts;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {
	public static void main(String [] args) {
		
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("goolge", 10000);
		map1.put("amazon", 12000);
		
		System.out.println("comp map size :: "+map1.size());
		Iterator it = map1.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey()+" "+pairs.getValue());
		}
		
		// convert hashMap keys into ArrayList:
		List<String> compNameList = new ArrayList<String>(map1.keySet());
		System.out.println("total emp names = "+compNameList);
		System.out.println(compNameList);
		for(String s : compNameList) {
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		List<Integer> empValues = new ArrayList<Integer>(map1.values());
		System.out.println("total emp values = "+empValues.size());
		for(Integer i : empValues) {
			System.out.println(i);
		}
		
		// using lambda expression 
		map1.forEach((k, v) -> System.out.println("key = "+k+" values = "+v));
		
		
	}
}
