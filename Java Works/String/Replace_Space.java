package String;

public class Replace_Space {

	public static void main(String[] args) {
		// Define the original string
		String str = "Hello How Are You?";

		// Print the original string
		System.out.println("Original String is : " + str);

		// Define the character to replace spaces with
		char ch = '-';

		// Replace all spaces in the string with the defined character
		str = str.replace(' ', ch);

		// Print the string after replacing spaces
		System.out.println("String after replacing space is : " + str);
	}
}
