package hashMapConcepts;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("pankaj", 104);
		map1.put("Abcdef", 100);
		map1.put("fghjhjk",101);
		map1.put("rtyuie", 103);
		map1.put("rtyuio", 105);
		map1.put("Naveen", 123);
		map1.put("Tom", 234);
		map1.put("Lisa", 456);
		map1.put("abc", 789);
		
		System.out.println(map1.get("pankaj"));
		// hashcode of pankaj -- 210678
		// index = 15
//		.equals to check the key name 
		// pankaj 
		// return value 
		
		
		
		// 
		
	}

}
