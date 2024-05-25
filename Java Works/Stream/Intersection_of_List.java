package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection_of_List {

	public static void main(String[] args) {
		// Creating two lists of integers
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

		// Finding the intersection of the two lists using Java Streams
		// Stream.filter() is used to filter elements from list1
		// The filter condition checks if each element in list1 is present in list2
		// list2::contains is a method reference that checks if an element from list1 is
		// contained in list2
		// Collecting the filtered elements into a new list using Collectors.toList()
		List<Integer> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());

		// Printing the intersection of the two lists
		System.out.println("Intersection of Two Lists is: " + intersection);
	}
}
