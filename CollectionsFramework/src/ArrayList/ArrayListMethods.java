package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("flutter");

		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("javascript");
		ar2.add("Php");

		// add elements of ar2 to ar1
//		ar1.addAll(ar2);

//		System.out.println(ar1);
//		System.out.println(ar2);
//		
		// add elements of ar2 to ar1 at particular index
//		ar1.addAll(1, ar2);
//		
//		System.out.println(ar1);

		// clear an arraylist
//		ar1.clear();
//		System.out.println(ar1);

		// clone element of arraylist to new arraylist
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);

		// check for presence using contains()
		System.out.println(ar1.contains("java"));
		System.out.println(ar1.contains("golang"));

		// indexOf()
		System.out.println(ar1.indexOf("ruby") > 0);
		System.out.println(ar1.indexOf("flutter"));

		// lastindexOf()

		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("pankaj", "sandesh", "pankaj", "abyakta", "pankaj"));
		System.out.println(list1);
		int ind = list1.lastIndexOf("pankaj");
		System.out.println(ind);

		// remove value from arraylist
		// with the index
		list1.remove(2);
		System.out.println(list1);

		// with the direct object
		list1.remove("sandesh");
		System.out.println(list1);

		// remove by applying condition
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		// remove even numbers
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers);

		// remove odd numbers
		numbers.removeIf(num -> num % 2 != 0);
		System.out.println(numbers);

		// get only specified values using retainAll()
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Tom", "Mike", "John", "Jerry", "Jerry"));
		namesList.retainAll(Collections.singleton("Jerry"));
		System.out.println(namesList);

		// get a sublist from an arraylist
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		ArrayList<Integer> subList = new ArrayList<>(number.subList(5, 10));
		System.out.println(subList);

		// converting an arraylist to an array using toArray()
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("oggy", "tom", "motu", "patlu", "chotu"));
		Object arr[] = newList.toArray();
//		System.out.println(Arrays.toString(arr));
		
		for(Object o : newList) {
			System.out.println((String)o);
		}
	}
}
