package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<>();
		studentList.add("Pankaj");
		studentList.add("Abyakta");
		studentList.add("Sandesh");
		studentList.add("pankaj");
		
		// typical for loop
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("----------------");
		
		// for each loop
		for(String s : studentList) {
			System.out.println(s);
		}
		
		System.out.println("-----------------");
		
		// jdk-8 lambda
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("-----------------");
		
		// iterator 
		Iterator<String> it = studentList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// list with other collection 
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(number);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("java", "python", "js", "php"));
		System.out.println(names);
		System.out.println(names.size());
	}

}
