package Stream;

import java.util.Arrays;
import java.util.List;

public class Longest_Prefix {

	public static void main(String[] args) {
		// List of strings
		List<String> strings = Arrays.asList("flower", "flow", "flight");

		// Finding the longest common prefix using Java Streams
		String longestCommonPrefix = strings.stream()
				// Using reduce to find the longest common prefix
				.reduce((s1, s2) -> {
					// Finding the minimum length of two strings
					int length = Math.min(s1.length(), s2.length());
					int i = 0;
					// Loop through characters of both strings until a mismatch is found
					while (i < length && s1.charAt(i) == s2.charAt(i)) {
						i++;
					}
					// Return the substring up to the index of the first mismatch
					return s1.substring(0, i);
				})
				// If no common prefix found, return an empty string
				.orElse("");

		// Printing the longest common prefix
		System.out.println("Longest common prefix: " + longestCommonPrefix);
	}
}
