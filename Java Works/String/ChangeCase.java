package String;

// Class to demonstrate changing the case of characters in a string
public class ChangeCase {
	public static void main(String[] args) {
		// Input string
		String str1 = "Great Power";

		// Create a StringBuffer to manipulate the string
		StringBuffer newStr = new StringBuffer(str1);

		// Loop through each character in the string
		for (int i = 0; i < str1.length(); i++) {
			// Checks if the character is in lower case
			if (Character.isLowerCase(str1.charAt(i))) {
				// Convert it into upper case using toUpperCase() function
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}
			// Checks if the character is in upper case
			else if (Character.isUpperCase(str1.charAt(i))) {
				// Convert it into lower case using toLowerCase() function
				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}

		// Print the string after case conversion
		System.out.println("String after case conversion : " + newStr);
	}
}
