package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	public static void main(String [] args) {
		
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,2,1,2,3,4,5,6,7));
		
		// 1. LinkedHashSet
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(number);
		
		ArrayList<Integer> numberList = new ArrayList<>(linkedHashSet);
		
		System.out.println(numberList);
		
		// 2. JDK 8 - stream : 
		
		ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4,5,6,7,8));
		List<Integer> marksUnique =  marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksUnique);
		
	}
}
