package mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Factorial {

	// Method to calculate the factorial of a given number n
	public int fact(int n) {
		int fact = 1; // Initialize factorial to 1
		for (int i = 1; i <= n; i++) {
			fact = fact * i; // Multiply fact by i in each iteration
		}
		return fact; // Return the calculated factorial
	}

	// Test method to test the fact method
	@Test
	public void testFact() {
		// Uncommenting the next line is unnecessary because we are calling the method
		// directly
		// Factorial f = new Factorial();

		// Assert that the factorial of 5 is 120
		assertEquals(120, fact(5));
	}
}
