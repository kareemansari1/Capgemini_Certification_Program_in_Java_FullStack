package mavenproject; // This declares the package name where this class belongs

import static org.junit.Assert.assertEquals; // Importing the static method assertEquals from the JUnit library
import org.junit.Test; // Importing the Test annotation from the JUnit library

public class Addition { // Declaring a public class named Addition

	// Method to add two integers
	public static int add(int a, int b) {
		return a + b;
	}

	// Method to multiply two integers
	public static int mul(int a, int b) {
		return a * b;
	}

	// Test method to check the addition functionality
	@Test
	public void addTest() {
		// Using assertEquals to check if the addition method returns the expected
		// result
		assertEquals(4, add(2, 2));
	}

	// Test method to check the multiplication functionality
	@Test
	public void mulTest() {
		// Using assertEquals to check if the multiplication method returns the expected
		// result
		assertEquals(6, mul(3, 2));
	}

}
