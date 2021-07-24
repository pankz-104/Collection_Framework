package ArrayList;

import java.util.*;

public class ArrayListDemo {
	public static void main(String [] args) {
		
		// default class 
		// dynamic array
		
		// 3 ways to declare 
		// default generics : 
		ArrayList<Object> ar = new ArrayList<Object>(); 
		ar.add(100);
		ar.add(200);
		ar.add("apple");
		ar.add(400);
		ar.add(true);
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
//		System.out.println(ar.get(-1));  // ArrayIndexOutOfBound
		System.out.println(ar.size());
		System.out.println("lowest index = "+ 0);
		System.out.println("highest index = "+ (ar.size()-1));
		
		List<Integer> arr = new ArrayList<>();
		
	}
}
