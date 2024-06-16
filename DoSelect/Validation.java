package DoSelect;

// Functional interface with a single abstract method isValid
@FunctionalInterface
interface validate {
	boolean isValid(String firstName, String lastName);
}

public class Validation {

	// Method to validate the username and password
	public boolean validate(String username, String password) {
		// Creating a lambda expression for the validate interface
		validate v = (s1, s2) -> {
			// Check if username is "ABC" and password is "DEF"
			return (s1.equals("ABC") && s2.equals("DEF")) ? true : false;
		};
		// Use the lambda expression to validate the input
		return v.isValid(username, password);
	}

	public static void main(String[] args) {
		// Creating an instance of Validation class
		Validation s = new Validation();
		// Defining username and password variables
		String uname = "Alexa";
		String pass = "coded123";
		// Printing the result of the validation
		System.out.println(s.validate(uname, pass));
	}
}
