package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Non_Duplicates {

	public static void main(String[] args) {
		// Create a list of numbers with some duplicates
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9);

		// Count the occurrences of each number using a frequency map
		Map<Integer, Long> frequencyMap = numbers.stream()
				// Group the numbers by their value and count the occurrences
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print the frequency map for reference
		System.out.println("Frequency Map: " + frequencyMap);

		// Stream the list of numbers again to filter out the non-duplicate numbers
		numbers.stream()
				// Filter the numbers, keeping only those that appear exactly once
				.filter(number -> frequencyMap.get(number) == 1)
				// Print each non-duplicate number
				.forEach(System.out::println);
	}
}
