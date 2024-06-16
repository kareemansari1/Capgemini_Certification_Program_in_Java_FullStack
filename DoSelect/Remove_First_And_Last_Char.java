package DoSelect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	public static String RemoveOccurances(String str, char C) {
		// Loop to find and remove the first occurrence of the character C
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == C) {
				// Remove the character at index i
				str = str.substring(0, i) + str.substring(i + 1);
				break; // Exit the loop after removing the first occurrence
			}
		}

		// Loop to find and remove the last occurrence of the character C
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == C) {
				// Remove the character at index i
				str = str.substring(0, i) + str.substring(i + 1);
				break; // Exit the loop after removing the last occurrence
			}
		}

		// Return the modified string
		return str;
	}
}

public class Remove_First_And_Last_Char {
	public static void main(String[] args) throws IOException {
		// Create a BufferedReader to read input from the console
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// Read the input string
		String str = bufferedReader.readLine();

		// Read the character and get its first character (as readLine() returns a
		// string)
		char C = bufferedReader.readLine().charAt(0);

		// Call the RemoveOccurances function and store the result
		String result = Result.RemoveOccurances(str, C);

		// Print the result
		System.out.print(result);

		// Close the BufferedReader
		bufferedReader.close();
	}
}
