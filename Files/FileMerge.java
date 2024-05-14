package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMerge {

	public static void main(String[] args) {
		// Initialize Scanner to read user input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the path of the first file
		System.out.print("Enter the path of the first file: ");
		String file1 = scanner.nextLine();

		// Prompt the user to enter the path of the second file
		System.out.print("Enter the path of the second file: ");
		String file2 = scanner.nextLine();

		// Prompt the user to enter the name of the merged file
		System.out.print("Enter the name of the merged file: ");
		String mergedFile = scanner.nextLine();

		// Call the mergeFiles method to merge the content of two files into one
		mergeFiles(file1, file2, mergedFile);

		// Close the Scanner
		scanner.close();
	}

	// Method to merge the content of two files into one
	public static void mergeFiles(String file1, String file2, String mergedFile) {
		try {
			// Initialize BufferedReaders to read from file1 and file2
			BufferedReader reader1 = new BufferedReader(new FileReader(file1));
			BufferedReader reader2 = new BufferedReader(new FileReader(file2));

			// Initialize BufferedWriter to write to the merged file
			BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile));

			String line;

			// Merge content from file1
			while ((line = reader1.readLine()) != null) {
				writer.write(line); // Write the current line to the merged file
				writer.newLine(); // Move to the next line in the merged file
			}

			// Merge content from file2
			while ((line = reader2.readLine()) != null) {
				writer.write(line); // Write the current line to the merged file
				writer.newLine(); // Move to the next line in the merged file
			}

			// Close all the streams
			reader1.close();
			reader2.close();
			writer.close();

			// Print success message
			System.out.println("Files merged successfully.");
		} catch (IOException e) {
			// Handle any errors that occur during the merging process
			System.out.println("An error occurred while merging files: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
