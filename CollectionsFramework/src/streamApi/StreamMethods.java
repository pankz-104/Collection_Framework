package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String [] args) {
		
		// filter(predicate)
					// boolean valued function 
					// e -> { return true / false}
					// e -> e > 10
		
		
		
		
		// map(Function)
		/*
		 * each element operation 
		 * square of each element
		 *
		 */
		
		List<String> names = List.of("aman", "ankit", "akash", "pankaj");
		List<String> filtered_name = names.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		System.out.println(filtered_name);
		
		List<Integer> number = List.of(2, 3, 6, 4, 5, 6, 1);
		List<Integer>new_number = number.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println(new_number);
		 
		new_number.forEach(n -> {
			System.out.println(n);
		});
		
		new_number.stream().forEach(System.out::println);
		
		// sort
		new_number.stream().sorted().forEach(System.out::println);
		
		// min 
		Integer integer = new_number.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("min :: "+integer);
		
		
		// max 
		Integer value = new_number.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("max :: "+value);
		
		// reduce 
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(even);
	}
}
