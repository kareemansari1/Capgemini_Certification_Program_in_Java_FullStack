package mavenproject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class Palindrome {

	// Method to check if a string is a palindrome (returns boolean)
	public boolean isPalindrome(String input) {
		if (input == null) {
			return false; // Null input is not a palindrome
		}
		// Remove whitespace and convert to lowercase
		String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
		int length = cleanedInput.length();
		// Check if the string reads the same forward and backward
		for (int i = 0; i < length / 2; i++) {
			if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
				return false; // Not a palindrome
			}
		}
		return true; // It is a palindrome
	}

	// Method to check if a string is a palindrome (returns string)
	public String isPalindrome1(String input) {
		if (input == null) {
			return "null"; // Null input is not a palindrome
		}
		// Remove whitespace and convert to lowercase
		String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
		int length = cleanedInput.length();
		// Check if the string reads the same forward and backward
		for (int i = 0; i < length / 2; i++) {
			if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
				return "Not Palindrome"; // Not a palindrome
			}
		}
		return "isPalindrome"; // It is a palindrome
	}

	// Test class to verify the PalindromeChecker methods
	public static class PalindromeCheckerTest {

		// Test method for the isPalindrome and isPalindrome1 methods
		@Test
		public void testPalindrome() {
			Palindrome checker = new Palindrome();

			// Testing the isPalindrome method
			assertTrue(checker.isPalindrome("mam")); // should return true
			assertTrue(checker.isPalindrome("12321")); // should return true
			assertTrue(checker.isPalindrome("No lemon, no melon")); // should return true
			assertFalse(checker.isPalindrome("hello")); // should return false
			assertFalse(checker.isPalindrome("world")); // should return false
			assertEquals(true, checker.isPalindrome("dad")); // should return true

			// Testing the isPalindrome1 method
			assertSame("isPalindrome", checker.isPalindrome1("dad")); // should return "isPalindrome"

			// Print the result of the isPalindrome1 method
			System.out.println(checker.isPalindrome1("dad")); // should print "isPalindrome"
		}
	}
}
