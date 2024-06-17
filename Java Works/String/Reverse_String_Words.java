package String;

import java.util.Scanner;

public class Reverse_String_Words {

	public static void main(String[] args) {
		// Declare a string variable to hold the user input
		String str;

		// Prompt the user to enter a string
		System.out.println("Enter a string: ");

		// Create a Scanner object to read the input from the console
		Scanner scanner = new Scanner(System.in);

		// Read the entire line of input and store it in the str variable
		str = scanner.nextLine();

		// Close the scanner to free up resources
		scanner.close();

		// Call the reverseString method to reverse the input string and store the
		// result
		String reversed = reverseString(str);

		// Print the reversed string
		System.out.println("The reversed string is: " + reversed);
	}

	// Method to reverse a string using recursion
	public static String reverseString(String s) {
		// Base case: if the string is empty, return the string itself
		if (s.isEmpty()) {
			return s;
		}

		// Recursive case: call reverseString on the substring excluding the first
		// character
		// and append the first character to the result
		return reverseString(s.substring(1)) + s.charAt(0);
	}
}
