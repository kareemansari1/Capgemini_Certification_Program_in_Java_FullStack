package Java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodRefrence {
	public static void main(String[] args) {
		// lambda function
		System.out.println("Lambda Function");

		// Creating a list of strings
		List<String> str1 = Arrays.asList("Nitesh", "Rutuja", "Kareem", "onkar");

		// Sorting the list using lambda function
		Collections.sort(str1, (i1, i2) -> i1.compareTo(i2));

		// Printing the sorted list using lambda function
		System.out.println("Sort String by Lambda Function");
		str1.forEach(l -> System.out.println(l));
		System.out.println();

		// method reference..........
		System.out.println("Method Reference");

		// Sorting the list using method reference
		Collections.sort(str1, String::compareTo);

		// Printing the sorted list using method reference
		str1.forEach(System.out::println);
		System.out.println("Method Reference");

		// Printing the sorted list using a for-each loop
		for (String arr : str1) {
			System.out.println(arr);
		}
	}
}
