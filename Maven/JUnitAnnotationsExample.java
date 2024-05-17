package mavenproject; // Declares the package name where this class belongs

import static org.junit.Assert.assertEquals; // Imports the static method assertEquals from the JUnit library
import static org.junit.Assert.assertFalse; // Imports the static method assertFalse from the JUnit library

import java.util.ArrayList; // Imports the ArrayList class from the Java Util library

import org.junit.After; // Imports the After annotation from the JUnit library
import org.junit.AfterClass; // Imports the AfterClass annotation from the JUnit library
import org.junit.Before; // Imports the Before annotation from the JUnit library
import org.junit.BeforeClass; // Imports the BeforeClass annotation from the JUnit library
import org.junit.Ignore; // Imports the Ignore annotation from the JUnit library
import org.junit.Test; // Imports the Test annotation from the JUnit library

public class JUnitAnnotationsExample { // Declares a public class named JUnitAnnotationsExample

	private static ArrayList<String> list; // Declares a private static ArrayList variable named list

	@BeforeClass // Annotates a method to be executed once before any of the test cases in the
					// class
	public static void m1() { // Declares a static method named m1
		System.out.println("Using @Beforeclass , Executed before all the test cases "); // Prints a message indicating
																						// the execution of the method
	}

	@Before // Annotates a method to be executed before each test case
	public void m2() { // Declares a method named m2
		list = new ArrayList<String>(); // Initializes the ArrayList
		System.out.println("Using @Before Annotations , Executed before all Each test cases "); // Prints a message
																								// indicating the
																								// execution of the
																								// method
	}

	@AfterClass // Annotates a method to be executed once after all the test cases in the class
	public static void m3() { // Declares a static method named m3
		System.out.println("Using @Afterclass , Executed After all  test cases "); // Prints a message indicating the
																					// execution of the method
	}

	@After // Annotates a method to be executed after each test case
	public void m4() { // Declares a method named m4
		System.out.println("Using @After , Executed After Each  test cases "); // Prints a message indicating the
																				// execution of the method
	}

	@Test // Annotates a method as a test case
	public void m5() { // Declares a method named m5
		list.add("test"); // Adds an element to the ArrayList
		list.add("Kareem"); // Adds an element to the ArrayList
		System.out.println("ArrayList is :" + list); // Prints the contents of the ArrayList
		assertFalse(list.isEmpty()); // Asserts that the ArrayList is not empty
		assertEquals(2, list.size()); // Asserts that the size of the ArrayList is 2
	}

	@Ignore // Annotates a test method to be ignored during test execution
	public void m6() { // Declares a method named m6
		System.out.println("Using @Ignore , This Execution is Ignore "); // Prints a message indicating the method is
																			// ignored
	}

	@Test(timeout = 100) // Annotates a method as a test case with a timeout of 100 milliseconds
	public void m7() { // Declares a method named m7
		System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case"); // Prints a
																											// message
																											// indicating
																											// the usage
																											// of
																											// timeout
	}

	@Test // Annotates a method as a test case
	public void m8() { // Declares a method named m8
		System.out.println("Using @Test(expected) ,it will check for specified exception during its execution"); // Prints
																													// a
																													// message
																													// indicating
																													// the
																													// usage
																													// of
																													// expected
	}
}
