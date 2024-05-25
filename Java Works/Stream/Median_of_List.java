package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Median_of_List {

	public static void main(String[] args) {
		// List of numbers
		List<Integer> numbers = Arrays.asList(5, 2, 1, 3, 4);

		// Calculate the median
		OptionalDouble median = numbers.stream().sorted() // Sort the numbers in ascending order
				.mapToInt(Integer::intValue) // Convert Integer stream to IntStream
				.average(); // Calculate the average value (which is the median for an odd number of
							// elements)

		// Printing the median
		if (median.isPresent()) {
			System.out.println("Median: " + median.getAsDouble());
		} else {
			System.out.println("No median found for an empty list.");
		}
	}
}
