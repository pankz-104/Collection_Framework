package ArrayList;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class SynchronizedArrayList {
	public static void main(String [] args) {
		
		// 1. Collections.synchronizedList() - returns synchronized list
		
		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		names.add("ruby");
		names.add("python");
		names.add("java");
		
		// add, remove - we don't need explicit synchronization
		
		// to fetch / traverse the values from the list -- we've to use explicit synchronization
		
		synchronized (names) {
			Iterator<String> it = names.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		// 2. copyOnWriteArrayList -- its a class
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("tom");
		empList.add("mike");
		empList.add("steve");
		
		// we don't need explicit synchronization for any operation: add/remove/traverse
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
