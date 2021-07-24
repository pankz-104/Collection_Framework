package hashTableConcept;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
			
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Pankaj", 100);
		marks.put("Tom", 200);
		marks.put("Jerry", 300);
		marks.put("Oggy", 400);
		marks.put("Chotu", 500);
		marks.put("Motu", null);
		
		System.out.println(marks.get("Jerry"));
//		System.out.println(marks.get(null));      // null key is not allowed
//		System.out.println(marks.get("Motu"));    // null value is not allowed 
		
		System.out.println(marks.get("Naveen"));
		System.out.println(marks.get("Peter"));
//		System.out.println(marks.get(""));
	}

}
