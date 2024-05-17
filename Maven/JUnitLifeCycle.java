package mavenproject; // Declares the package name where this class belongs

import org.junit.After; // Importing the After annotation from the JUnit library
import org.junit.AfterClass; // Importing the AfterClass annotation from the JUnit library
import org.junit.Before; // Importing the Before annotation from the JUnit library
import org.junit.BeforeClass; // Importing the BeforeClass annotation from the JUnit library
import org.junit.Ignore; // Importing the Ignore annotation from the JUnit library
import org.junit.Test; // Importing the Test annotation from the JUnit library

public class JUnitLifeCycle { // Declares a public class named JUnitLifeCycle

	@Before // Annotates a method to be executed before each test method
	public void beforeTestMethod() { // Declares a method named beforeTestMethod
		System.out.println("Before -run before test method"); // Prints a message before executing the test method
	}

	@After // Annotates a method to be executed after each test method
	public void afterTestMethod() { // Declares a method named afterTestMethod
		System.out.println("after - run after test method"); // Prints a message after executing the test method
	}

	@BeforeClass // Annotates a method to be executed once before any of the test methods in the
					// class
	public static void runOnceBeforeClass() { // Declares a static method named runOnceBeforeClass
		System.out.println("Beforeclass- run before test method"); // Prints a message before executing any test method
	}

	@AfterClass // Annotates a method to be executed once after all the test methods in the
				// class have been run
	public static void runOnceAfterClass() { // Declares a static method named runOnceAfterClass
		System.out.println("Afterclass - run after test method"); // Prints a message after executing all test methods
	}

	@Ignore // Annotates a test method to be ignored during test execution
	public void ignore() { // Declares a method named ignore
		System.out.println("Ignore stmt."); // Prints a message indicating that this method is ignored
	}

	@Ignore // Annotates a test method to be ignored during test execution
	@Test(timeout = 1000) // Annotates a test method with a timeout of 1000 milliseconds
	public void testTimeOut() { // Declares a method named testTimeOut
		System.out.println("test timeout - 1s sec."); // Prints a message for the timed-out test
	}

	@Test(timeout = 500) // Annotates a test method with a timeout of 500 milliseconds
	public void testTimeOut1() { // Declares a method named testTimeOut1
		System.out.println("test timeout - 0.5 sec."); // Prints a message for the timed-out test
	}

	@Test(timeout = 500) // Annotates a test method with a timeout of 500 milliseconds
	public void testTimeOut2() { // Declares a method named testTimeOut2
		System.out.println("test timeoutdefault"); // Prints a message for the timed-out test
	}

}
