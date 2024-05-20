package Java8Features;

// Functional interface for factorial calculation
@FunctionalInterface
interface Factorial {
	int fact(int num);
}

public class FactorialUsingLambda {

	public static void main(String[] args) {
		// Lambda expression for factorial calculation
		Factorial factorial = (int n) -> {
			int result = 1;
			// Loop to calculate factorial
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result; // Returning the factorial result
		};

		// Testing the factorial lambda expression
		System.out.println("Factorial of 5 is: " + factorial.fact(5)); // Output: 120
		System.out.println("Factorial of 6 is: " + factorial.fact(6)); // Output: 720
	}
}
