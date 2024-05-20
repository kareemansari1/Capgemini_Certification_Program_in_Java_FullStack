package Java8Features;

import java.util.Arrays;
import java.util.List;

public class LambdaEx1 {

	public static void main(String[] args) {
		// Creating a list of integers
		List<Integer> intSeq = Arrays.asList(1, 2, 3);

		// Using lambda expression to iterate and print each element of the list
		intSeq.forEach(x -> System.out.println(x));
	}
}
