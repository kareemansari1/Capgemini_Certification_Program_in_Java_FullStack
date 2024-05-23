package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge2SortedLists {

	public static void main(String[] args) {
		// Creating two sorted lists
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

		// Merging the two sorted lists
		List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()) // Concatenating streams of both lists
				.sorted() // Sorting the merged stream
				.collect(Collectors.toList()); // Collecting the sorted elements into a list

		// Printing the merged list
		System.out.println("Merged List: " + mergedList);
	}

}
