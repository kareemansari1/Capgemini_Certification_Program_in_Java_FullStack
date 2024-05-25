package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_of_Words {

	public static void main(String[] args) {
		// List of words
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

		// Using Java Streams to find the frequency of each word
		// Collecting words into a Map where keys are words and values are their
		// frequencies
		Map<String, Long> wordFrequency = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Printing the result
		System.out.println("Word Frequency: " + wordFrequency);
	}
}
