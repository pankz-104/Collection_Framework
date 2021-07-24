package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {
	public static void main(String [] args) {
		
		// 1. sort and then equals
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		
		// 2.compare two list - find out additional element in first list
		
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		
		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));
		
//		list4.removeAll(list5);
//		System.out.println(list4);
		
		// 3. find out the missing element 
		
		list5.removeAll(list4);
		System.out.println(list5);
		
		// 4. find out common elements 
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("python", "java", "ruby", "C#"));
		
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("python", "java", "ruby", "javascript"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
	}
}
