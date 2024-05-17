package mavenproject; // Declares the package name where this class belongs

// Imports static methods for various assertion types from the JUnit library
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test; // Imports the Test annotation from the JUnit library

public class AssertEqualsMethods { // Declares a public class named AssertEqualsMethods

	@Test // Indicates that this method is a test method
	public void testAssert() { // Declares a method named testAssert

		// Variable declaration
		String string1 = "Junit"; // Declares a string variable and assigns it the value "Junit"
		String string2 = "Junit"; // Declares a string variable and assigns it the value "Junit"
		String string3 = "test"; // Declares a string variable and assigns it the value "test"
		String string4 = "test"; // Declares a string variable and assigns it the value "test"
		String string5 = null; // Declares a string variable and assigns it the value null
		int variable1 = 1; // Declares an integer variable and assigns it the value 1
		int variable2 = 2; // Declares an integer variable and assigns it the value 2
		int[] arithmeticArray1 = { 1, 2, 3 }; // Declares an integer array variable and assigns it an array
		int[] arithmeticArray2 = { 1, 2, 3 }; // Declares an integer array variable and assigns it an array

		// Assert statements
		assertEquals(string1, string2); // Asserts that two strings are equal
		assertSame(string3, string4); // Asserts that two strings refer to the same object
		assertNotSame(string1, string3); // Asserts that two strings do not refer to the same object
		assertNotNull(string1); // Asserts that an object reference is not null
		assertNull(string5); // Asserts that an object reference is null
		assertTrue(variable1 < variable2); // Asserts that a condition is true
		assertArrayEquals(arithmeticArray1, arithmeticArray2); // Asserts that two arrays are equal
	}
}
