package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition_of_Lists {

	public static void main(String[] args) {
		// List of numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Using Java Streams to partition the list into even and odd numbers
		// Collecting numbers into a Map where keys are booleans (true for even, false
		// for odd)
		// and values are lists of numbers that satisfy the partitioning condition
		Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		// Retrieving even and odd numbers from the partitioned map
		List<Integer> evenNumbers = partitioned.get(true);
		List<Integer> oddNumbers = partitioned.get(false);

		// Printing the result
		System.out.println("Even numbers: " + evenNumbers);
		System.out.println("Odd numbers: " + oddNumbers);
	}
}
