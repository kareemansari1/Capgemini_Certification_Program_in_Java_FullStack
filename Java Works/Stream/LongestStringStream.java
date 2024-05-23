package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringStream {

	public static void main(String[] args) {
		// List of strings
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");

		// Find the longest string using streams
		// max() operation is used to find the maximum element of the stream
		// Comparator.comparingInt(String::length) is a comparator that compares strings
		// by their length
		// Here, we are using method reference String::length to get the length of each
		// string
		Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));

		// Print the longest string, if present
		// Optional.ifPresent() is used to perform an action only if the optional
		// contains a value
		// Here, we print the longest string if it exists, otherwise, we print
		// "Optional.empty"
		longestString.ifPresent(System.out::println);
	}

}
