package String;

public class RemoveWhiteSpace {
	// Class declaration

	public static void main(String[] args) { // Main method

		// Original string with white spaces
		String str1 = "Remove white spaces";

		// Removes the white spaces using regex
		// "\\s+" is a regular expression pattern that matches one or more white space
		// characters
		// "replaceAll" method replaces all occurrences of the matched pattern with an
		// empty string
		str1 = str1.replaceAll("\\s+", "");

		// Print the modified string after removing white spaces
		System.out.println("String after removing all the white spaces : " + str1);
	}
}
