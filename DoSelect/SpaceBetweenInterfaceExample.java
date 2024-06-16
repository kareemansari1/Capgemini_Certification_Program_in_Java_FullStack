package DoSelect;

// Define a functional interface SpaceBetweenInterface with a single method addSpace
@FunctionalInterface
interface SpaceBetweenInterface {
	String addSpace(String s);
}

public class SpaceBetweenInterfaceExample {
	// Method to insert spaces between characters in a string
	String insertspace(String s) {
		// Lambda expression to implement the addSpace method of the
		// SpaceBetweenInterface
		SpaceBetweenInterface spaceBetweenInterface = (String str) -> {
			// Replace each character in the string with itself followed by a space,
			// then remove any leading or trailing spaces
			String s1 = s.replace("", " ").trim();
			return s1;
		};
		// Call the addSpace method using the lambda expression
		return spaceBetweenInterface.addSpace(s);
	}

	public static void main(String[] args) {
		// Create an instance of SpaceBetweenInterfaceExample class
		SpaceBetweenInterfaceExample spaceBetweenInterfaceExample = new SpaceBetweenInterfaceExample();
		// Call insertspace method to add spaces to the string "Welcome"
		String ss = spaceBetweenInterfaceExample.insertspace("Welcome");
		// Print the modified string
		System.out.println(ss);
	}
}
