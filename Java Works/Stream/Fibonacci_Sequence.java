package Stream;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		// Generate Fibonacci sequence using Stream.iterate
		LongStream fibonacci = Stream.iterate(new long[] { 0, 1 }, // Initial seed values of Fibonacci sequence
				f -> new long[] { f[1], f[0] + f[1] } // Generate next Fibonacci number
		).mapToLong(f -> f[0]); // Convert array to long stream (contains only the Fibonacci numbers)

		// Print the first 10 Fibonacci numbers
		fibonacci.limit(10).forEach(System.out::println);
	}

}
