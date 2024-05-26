package Stream;

import java.util.stream.IntStream;

public class Product_of_Integers {

	public static void main(String[] args) {
		// Define an array of integers
		int[] array = { 1, 4, 3, 6, 2, 7, 8 };

		// Use IntStream to generate a stream of integers from 0 to array.length - 1
		int maxProduct = IntStream.range(0, array.length)
				// For each index i in the array
				.mapToObj(i ->
				// Create another stream of integers from i+1 to array.length - 1
				IntStream.range(i + 1, array.length)
						// Map each element j to the product of array[i] and array[j]
						.map(j -> array[i] * array[j])
						// Find the maximum product in this stream, or Integer.MIN_VALUE if stream is
						// empty
						.max().orElse(Integer.MIN_VALUE))
				// Find the maximum product among all products calculated
				.max(Integer::compare)
				// If the stream is empty, return Integer.MIN_VALUE
				.orElse(Integer.MIN_VALUE);

		// Print the maximum product
		System.out.println("Maximum product: " + maxProduct);
	}
}
