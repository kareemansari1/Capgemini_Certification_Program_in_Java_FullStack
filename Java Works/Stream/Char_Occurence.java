package Stream;

import java.util.Arrays;
import java.util.List;

public class Char_Occurence {

	public static void main(String[] args) {
		// Create a list of strings
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "melon");

		// Define the target character to count
		char target = 'a';

		// Use Java Streams to count occurrences of the target character
		long occurrences = strings.stream()
				// Convert each string to an IntStream of its characters
				.flatMapToInt(CharSequence::chars)
				// Filter the characters to keep only those that match the target character
				.filter(c -> c == target)
				// Count the remaining characters
				.count();

		// Print the total number of occurrences of the target character
		System.out.println("Occurrences of '" + target + "': " + occurrences);
	}
}
