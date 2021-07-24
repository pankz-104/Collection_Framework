package streamApi;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
			
		// Stream API -- collection process 
		// group of object 
		
		// 1. blank string 
		
		Stream<Object> emptyStream = Stream.empty();	
		
		// 2 - array, object, collection 
		String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};
		Stream<String> stream1 =  Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		// 3. streamBuilder 
		
		Stream<Object> streamBuilder = Stream.builder().build();
		
		// 4. 
		IntStream stream = Arrays.stream(new int[] {1, 2, 3, 4});
		stream.forEach(e ->{
			System.out.println(e);
		});
		
		
		// 5.
		 List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		 Stream <Integer> stream2 = list2.stream();
		 
		 stream2.forEach(e -> {
			 System.out.println(e);
		 });
	}
}
