package Stream;

import java.util.Random;
import java.util.stream.Stream;

public class Random_Number {

	public static void main(String[] args) {
		// Create an instance of the Random class
		Random random = new Random();

		// Generate an infinite stream of random integers
		Stream<Integer> randomNumbers = Stream.generate(random::nextInt);

		// For demonstration, limit the stream to 10 random numbers and print them
		randomNumbers.limit(10).forEach(System.out::println);
	}
}
