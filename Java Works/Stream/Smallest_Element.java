package Stream;

import java.util.Arrays;

public class Smallest_Element {

	public static void main(String[] args) {
		// Input array
		int[] array = { 4, 2, 7, 1, 5, 3, 6 };
		int k = 3; // Find the 3rd smallest element

		// Using Java Streams to find the kth smallest element
		// 1. Sort the array in ascending order
		// 2. Skip the first (k - 1) elements (0-indexed)
		// 3. Find the first element after skipping (which is the kth smallest)
		// 4. If no such element is found (array length < k), return -1 as default value
		int kthSmallest = Arrays.stream(array).sorted() // Sorting the array in ascending order
				.skip(k - 1) // Skipping the first (k - 1) elements
				.findFirst() // Finding the first element after skipping
				.orElse(-1); // If no element found, default to -1

		// Printing the result
		System.out.println("Smallest Third Element in Array is: " + kthSmallest);
	}

}
