package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Null_Values {

	public static void main(String[] args) {
		// If you’re dealing with methods that may return null, you can wrap the values
		// in an Optional to handle null values more gracefully.

		// Create a list of strings with some null values
		List<String> list = Arrays.asList("apple", null, "banana", null, "orange");

		// Use Java Streams to wrap each element in an Optional
		List<Optional<String>> optionalList = list.stream()
				// Map each element to an Optional, wrapping null values in Optional.empty()
				.map(Optional::ofNullable)
				// Collect the result into a list of Optionals
				.collect(Collectors.toList());

		// Print the list of Optionals
		optionalList.forEach(System.out::println);

		// Example: Filter out null values (Optional.empty()) and get a list of non-null
		// values
		List<String> nonNullValues = optionalList.stream()
				// Filter out Optional.empty() values
				.filter(Optional::isPresent)
				// Map the Optional values to their contained values
				.map(Optional::get)
				// Collect the non-null values into a list
				.collect(Collectors.toList());

		// Print the list of non-null values
		System.out.println("Non-null values: " + nonNullValues);
	}
}
