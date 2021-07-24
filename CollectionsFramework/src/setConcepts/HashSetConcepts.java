package setConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		hs.add("Alpha");
		hs.add("Beta");
		hs.add("gamma");
		hs.add("Alpha"); 	// no duplicate values allowed 
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.contains("Beta"));
		
		for(String s : hs) {
			System.out.println(s);
		}
		
		hs.remove("gamma");
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1, 4, 2, 5, 0}));
		
		// union of two sets 
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		// intersection to two sets 
		Set<Integer> intersection = new HashSet<>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		// get the differences 
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
		
		
		
	}
}
