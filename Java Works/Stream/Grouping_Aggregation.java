package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping_Aggregation {

	public static void main(String[] args) {
		// Grouping and aggregation operations on Java streams can be performed using
		// the Collectors.groupingBy and Collectors.summarizingInt (or similar)
		// collectors. These collectors allow you to group elements based on certain
		// criteria and perform aggregation operations like sum, average, count, etc.
		// For example:

		// Create a list of names
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane", "James", "Emily");

		// Group names by their length and count the number of names in each group
		Map<Integer, Long> countByNameLength = names.stream()
				// Group names by their length
				.collect(Collectors.groupingBy(String::length, // Grouping criterion: length of the name
						Collectors.counting() // Downstream collector: count the number of names in each group
				));

		// Print the result
		System.out.println("Count of names by length: " + countByNameLength);

		// Additional example: Summarize the length of names in each group
		Map<Integer, Integer> sumByNameLength = names.stream()
				// Group names by their length
				.collect(Collectors.groupingBy(String::length, // Grouping criterion: length of the name
						Collectors.summingInt(String::length) // Downstream collector: sum the lengths of names in each
																// group
				));

		// Print the result
		System.out.println("Sum of lengths of names by length: " + sumByNameLength);
	}
}
