package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String [] args) {
		
		// create a list and filter even numbers 
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,50,60,70,80,90));
//		number.removeIf(num ->  num %2 == 0);
//		System.out.println(number);
	
//		List<Integer> list = List.of(20, 30, 40, 50);
//		list.add(30);
//		System.out.println(list);
		
//		List<Integer> listEven = new ArrayList<Integer>();
//		List<Integer> listOdd = new ArrayList<Integer>();
//		for(int s : number) {
//			if(s % 2 == 0) {
//				listEven.add(s);
//			}
//			else {
//				listOdd.add(s);
//			}
//		}
//		System.out.println(listEven);
//		System.out.println(listOdd);
		
		// using stream
//		Stream<Integer> stream = number.stream();
//		List<Integer> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
//		System.out.println(newList);
//		
//		List<Integer> newlist = number.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(newlist);
//		
//		List<Integer> gr_elements = number.stream().filter(i -> i > 50).collect(Collectors.toList());
//		System.out.println(gr_elements);
//		
//		List<Integer> small_numbers = number.stream().filter(i -> i<50).collect(Collectors.toList());
//		System.out.println(small_numbers);
		
		// creating a stream object 
		
		
	}
}
