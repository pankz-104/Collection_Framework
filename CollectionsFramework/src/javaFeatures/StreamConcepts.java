package javaFeatures;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamConcepts {

	public static void main(String[] args) {
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(e -> e % 2 == 0);
		
		Stream.of("hello", "java")
			.map(e -> e + "world")
				.forEach(System.out::println);

		
		// optional -- containter for any kind of oject 
		String s [] = new String[4];
		System.out.println(s[2].length());
		 
		Optional<String> isNull = Optional.ofNullable(s[2]);
		
		if(isNull.isPresent()) {
			
		}
		else {
			System.out.println("value is not available");
		}
	}
}
