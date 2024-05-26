package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram_List {

	public static void main(String[] args) {
		// Define a list of words
		List<String> words = Arrays.asList("listen", "silent", "hello", "world", "night", "thing");

		// Group words into anagrams
		Map<String, List<String>> anagrams = words.stream()
				// Group words by anagram key
				.collect(Collectors.groupingBy(str -> {
					// Convert each word to char array, sort it, and convert back to string
					char[] chars = str.toCharArray();
					Arrays.sort(chars);
					return new String(chars); // Anagram key
				}));

		// Print the anagrams map
		System.out.println("Anagrams: " + anagrams);
	}
}
