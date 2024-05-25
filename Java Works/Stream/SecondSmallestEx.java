package Stream;

// Functional interface to define a method for finding the second smallest element in an array
@FunctionalInterface
interface SecondSmallestInterface {
	int secondSmallest(int[] arr);
}

public class SecondSmallestEx {
	// Method to find the second smallest element in an array
	int findSecondSmallest(int a[]) {
		// Lambda expression to implement the functional interface
		SecondSmallestInterface ssi = (arr) -> {
			// Check if the array has less than 2 elements
			if (arr.length < 2) {
				return -1; // Not enough elements for a second smallest number
			}

			// Initialize variables to store smallest and second smallest numbers
			int smallest = Integer.MAX_VALUE;
			int secondSmallest = Integer.MAX_VALUE;

			// Iterate through the array to find the smallest and second smallest numbers
			for (int num : arr) {
				if (num < smallest) {
					// Update secondSmallest if a new smallest number is found
					secondSmallest = smallest;
					smallest = num;
				} else if (num < secondSmallest && num != smallest) {
					// Update secondSmallest if a number greater than smallest but smaller than
					// secondSmallest is found
					secondSmallest = num;
				}
			}

			// Return the second smallest number
			return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest; // Return -1 if no second smallest number
																				// found
		};

		// Call the method defined in the functional interface
		return ssi.secondSmallest(a);
	}

	public static void main(String[] args) {
		// Create an instance of SecondSmallestEx class
		SecondSmallestEx secondSmallestEx = new SecondSmallestEx();

		// Sample array
		int[] arr = { 12, 13, 11, 10, 34, 15 };

		// Call the method to find the second smallest number
		int result = secondSmallestEx.findSecondSmallest(arr);

		// Print the result
		if (result != -1) {
			System.out.println("The second smallest number is: " + result);
		} else {
			System.out.println("There is no second smallest number.");
		}
	}
}
