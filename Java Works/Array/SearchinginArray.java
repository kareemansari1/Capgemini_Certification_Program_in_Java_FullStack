package Array;

import java.util.Arrays;

public class SearchinginArray {

	public static void main(String[] args) {
		byte byteArr[] = { 10, 20, 15, 22, 35 };
		char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
		int intArr[] = { 10, 20, 15, 22, 35 };
		double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
		float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
		short shortArr[] = { 10, 20, 15, 22, 35 };

		System.out.println("Index of 22 in byte array: " + Arrays.binarySearch(byteArr, (byte) 22));
		System.out.println("Index of 'g' in char array: " + Arrays.binarySearch(charArr, 'g'));
		System.out.println("Index of 22 in int array: " + Arrays.binarySearch(intArr, 22));
		System.out.println("Index of 15.1 in double array: " + Arrays.binarySearch(doubleArr, 15.1));
		System.out.println("Index of 15.1f in float array: " + Arrays.binarySearch(floatArr, 15.1f));
		System.out.println("Index of 22 in short array: " + Arrays.binarySearch(shortArr, (short) 22));
	}
}
