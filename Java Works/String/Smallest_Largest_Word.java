package String;

public class Smallest_Largest_Word {
	public static void main(String[] args) {
		// Initialize the string to be processed
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";

		// Split the string into words based on spaces and store them in an array
		String[] words = string.split(" ");

		// Initialize the smallest and largest words with the first word in the array
		String small = words[0];
		String large = words[0];

		// Iterate through each word in the array
		for (String word : words) {
			// If the current word is smaller than the smallest word found so far, update
			// 'small'
			if (word.length() < small.length()) {
				small = word;
			}
			// If the current word is larger than the largest word found so far, update
			// 'large'
			if (word.length() > large.length()) {
				large = word;
			}
		}

		// Print the smallest and largest words
		System.out.println("Smallest word: " + small);
		System.out.println("Largest word: " + large);
	}
}
