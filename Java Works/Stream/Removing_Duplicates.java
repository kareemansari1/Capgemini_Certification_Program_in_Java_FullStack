package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removing_Duplicates {

	public static void main(String[] args) {
		// Creating a list of integers with duplicates
		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

		// Using Java Streams to remove duplicates
		// Stream.distinct() method is used to remove duplicate elements from the stream
		// Collecting the unique elements into a new list using Collectors.toList()
		List<Integer> uniqueNumbers = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());

		// Printing the list of unique numbers
		System.out.println("Unique Numbers are: " + uniqueNumbers);
	}
}
