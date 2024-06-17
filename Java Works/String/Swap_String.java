package String;

public class Swap_String {

	public static void main(String[] args) {
		// Initialize two strings
		String str1 = "Good ", str2 = "morning ";
		// Print the original values of the strings
		System.out.println("Strings before swapping: " + str1 + " " + str2);

		// Step 1: Concatenate both strings str1 and str2, and store the result in str1
		str1 = str1 + str2;
		// After concatenation, str1 becomes "Good morning "

		// Step 2: Extract the original str2 from the concatenated string
		// The length of the original str2 is str2.length(), so we take a substring from
		// the beginning to the length of the concatenated string minus str2.length()
		str2 = str1.substring(0, (str1.length() - str2.length()));
		// After this step, str2 becomes "Good "

		// Step 3: Extract the original str1 from the concatenated string
		// Now, str2 contains the original value of str1, so we can get the original
		// str1
		// by taking a substring starting from str2.length() to the end of the
		// concatenated string
		str1 = str1.substring(str2.length());
		// After this step, str1 becomes "morning "

		// Print the swapped values of the strings
		System.out.println("Strings after swapping: " + str1 + " " + str2);
	}
}
