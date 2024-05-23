package Stream;

import java.util.stream.IntStream;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 13; // Number to check for primality
		System.out.println("Prime checking...." + isPrime(n)); // Print the result of prime checking
	}

	// Method to check if a number is prime
	private static boolean isPrime(int number) {
		// A number is prime if it is greater than 1 and divisible only by 1 and itself
		// Using IntStream to generate a range from 2 to number - 1 (exclusive)
		// Checking if none of the numbers in the range divides the given number evenly
		return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
	}
}
