package String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWordFile {

	public static void main(String[] args) {
		// Specify the file path
		File file = new File("F:demo.txt");

		// Count the number of words in the specified file
		int wordCount = countWordsInFile(file);

		// Print the result
		System.out.println("Number of words present in the given file: " + wordCount);
	}

	/**
	 * This method counts the number of words in a given file.
	 * 
	 * @param file The file to read from
	 * @return The number of words in the file
	 */
	public static int countWordsInFile(File file) {
		int count = 0;

		// Use try-with-resources to ensure the BufferedReader is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;

			// Read each line until the end of the file
			while ((line = br.readLine()) != null) {
				// Split each line into words using whitespace as the delimiter
				String[] words = line.split("\\s+");

				// Add the number of words in this line to the total count
				count += words.length;
			}
		} catch (IOException e) {
			// Handle potential IOException by printing the stack trace
			e.printStackTrace();
		}

		return count;
	}
}
