package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		// no order -- no indexing 
		// stores values == key-value <k, v>
		// key cannot be duplicate 
		// not thread safe -- not synchronized
		
		HashMap<String, String> capitalMap = new HashMap<>();
		// adding entries 
		capitalMap.put("Nepal","Kathmandu");
		capitalMap.put("India","New Delhi");
		capitalMap.put("USA", "washington DC");
		capitalMap.put(null, "Chennai");
		capitalMap.put(null, "Hydrabad");		// update previous null value
		capitalMap.put("Russia", null);
		capitalMap.put("Pakistan", null);
		
		// removing entries 
		capitalMap.remove("Pakistan");
//		capitalMap.put("India", "Mumbai");     // update previous key 
		System.out.println(capitalMap.get("Nepal"));
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		
		// iterator : 2 ways -- keyset() and valueset()
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
//			System.out.println(it.next());
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = "+key+" "+"value = "+value);
		}
		
		System.out.println("------------------------------");
		// iterator : over the set (pair) : by using entryset
		
		Iterator <Entry<String, String>> itt = capitalMap.entrySet().iterator();
		while(itt.hasNext()) {
			Entry<String, String> entry = itt.next();
			System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
		}
		
		// iterate using java 8 for each method 
		System.out.println("--------------------------------");
		capitalMap.forEach((k, v) -> System.out.println("key = "+k+" "+" value = "+v));
		
		
		// iterate using for each loop 
		System.out.println("---------------------------------");
		
		for(Map.Entry ele : capitalMap.entrySet()) {
			String key = (String)ele.getKey();
			String value = (String) ele.getValue();
			System.out.println("key = "+key+" "+"Value = "+value);
		}
	}
}
