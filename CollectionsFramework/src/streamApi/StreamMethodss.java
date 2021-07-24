package streamApi;

import java.util.*;

public class StreamMethodss {
	public static void main(String [] args) {
		
		// 1. anyMatch()
		// anyMatch(Predicate predicate) returns whether any elements of stream match provided predicate.
		// boolean anyMatch(Predicate <? super T> predicate)
		// to check if any element in list satisfy the given condition 
		
		// creating a list of integers 
		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 10);
		
		// stream anyMatch (Predicate predicate)
		
		boolean answer = list.stream().anyMatch(n -> (n*(n+1))/4 == 5);
		System.out.println(answer);
		
		// to check if list is having uppercase character at first index 
		
		List<String> names = Arrays.asList("Sandesh","Abyakta","Pankaj");
		
		boolean value = names.stream().anyMatch(str -> Character.isUpperCase(str.charAt(2)));
		System.out.println(value);
		
		// 2.noneMatch()
		// returns whether no elements of stream match the provided predicate
		
		boolean out = names.stream().noneMatch(str -> Character.isLowerCase(str.charAt(0)));
		System.out.println(out);
		
		// 3. mapToLong()
		// returns a new stream 
		
		List<String> list1 = Arrays.asList("22", "23", "445555");
		list1.stream().mapToLong(num -> Long.parseLong(num)).filter(num -> Math.sqrt(num) / 5 == 3).forEach(System.out::println);
		
	}
}
