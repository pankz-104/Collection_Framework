package vector;

import java.util.*;

public class VectorDemo {
	public static void main(String [] args) {
		
		// synchronized 
		// enumerator, iterator
		// thread-safe
		
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(1);
		vec.add(2);
		
		System.out.println(vec.get(1));
		vec.remove(1);
		System.out.println(vec);
		
		Vector<Integer> yvec = new Vector<Integer>();
		
		yvec.add(10);
		yvec.add(10);
		yvec.add(20);
		
		System.out.println(yvec);
		
		for(Integer e : yvec) {
			System.out.println(e);
		}
		
		for(int p=0; p<yvec.size(); p++) {
			System.out.println(yvec.get(p));
		}
		
		Iterator<Integer> it = yvec.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collections.sort(yvec);
		System.out.println(yvec);
	}
}
