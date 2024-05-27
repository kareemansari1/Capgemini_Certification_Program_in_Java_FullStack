package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Pairs_of_Numbers {

	public static void main(String[] args) {
		// Create a list of numbers
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

		// Define the target sum
		int target = 12;

		// Use Java Streams to find pairs that sum up to the target value
		Set<String> pairs = numbers.stream()
				// For each number 'i' in the list, create a stream of pairs with 'j' from the
				// same list
				.flatMap(i -> numbers.stream()
						// Map each pair to a string representation if they sum to the target, or an
						// empty string otherwise
						.map(j -> i + j == target ? "(" + i + ", " + j + ")" : ""))
				// Filter out empty strings (non-matching pairs)
				.filter(s -> !s.isEmpty())
				// Collect the results into a set to avoid duplicates
				.collect(Collectors.toSet());

		// Print the pairs that sum up to the target value
		System.out.println("Pairs that sum up to " + target + ": " + pairs);
	}
}
