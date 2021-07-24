package linkedList;

import java.util.*;

public class LinkedListDemo {
	public static void main(String [] args) {
		
		// LL is a default class in java 
		// it can be used as List, Queue, Stack
		// it allows the null entry
		// dynamic allocation 
		// hence insertion and deletion can be easily implemented 
		// it can contain duplicate elements 
		// it is not synchronized(not thread safe)
		// in LL, manipulation is dast because we dont need any shifting 
		
		// LL consctructors:: 
		
		// LinkedList();
		// LinkedList(Collection c);
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Pankaj");
		list1.add("Pandey");
		list1.add("Jerry");
		list1.add("TOm");
		list1.add("George");
		
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		System.out.println(list1);
		
		// Iteration over linkedlist 
		
		Iterator<String> it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// adding at particular index 
		list1.add(3, "Albert");
		System.out.println(list1);
		
		LinkedList<String> users = new LinkedList<>();
		users.add("Peter");
		users.add("Trump");
		
		list1.addAll(users);
		System.out.println(list1);
		
		list1.addFirst("Swornika");
		list1.addLast("Majhi");
		
		System.out.println(list1);
		
		list1.remove(2);
		System.out.println(list1);
		
		list1.removeAll(users);
		System.out.println(list1);
		
		list1.removeFirst();
		list1.removeLast();
		
		System.out.println(list1);
		
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String e : list1) {
			System.out.println(e);
		}
	}
}
