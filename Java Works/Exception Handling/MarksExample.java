package exception;

// Custom exception class
class InvalidMarksException extends Exception {
	public InvalidMarksException(String message) {
		super(message);
	}
}

public class MarksExample {
	// Method to validate marks
	public static void validateMarks(int marks) throws InvalidMarksException {
		// Check if marks are out of range
		if (marks < 0 || marks > 100) {
			// If out of range, throw custom exception
			throw new InvalidMarksException("Marks Should Be Between 0 to 100");
		}
	}

	public static void main(String[] args) {
		try {
			// Sample marks
			int marks = 105;
			// Call the method to validate marks
			validateMarks(marks);
			// If validation passes, print the marks
			System.out.println("Marks :" + marks);
		} catch (InvalidMarksException e) {
			// Catch and handle the custom exception
			System.out.println("Error: " + e.getMessage());
		}
	}
}
