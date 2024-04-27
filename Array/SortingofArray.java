package Array;

import java.util.Arrays;

public class SortingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteArr[] = { 10, 20, 15, 22, 35 };
		char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
		int intArr[] = { 10, 20, 15, 22, 35 };
		double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
		float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
		short shortArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(byteArr);
		System.out.println("Sorted byte array: " + Arrays.toString(byteArr));

		Arrays.sort(charArr);
		System.out.println("Sorted char array: " + Arrays.toString(charArr));

		Arrays.sort(intArr);
		System.out.println("Sorted int array: " + Arrays.toString(intArr));

		Arrays.sort(doubleArr);
		System.out.println("Sorted double array: " + Arrays.toString(doubleArr));

		Arrays.sort(floatArr);
		System.out.println("Sorted float array: " + Arrays.toString(floatArr));

		Arrays.sort(shortArr);
		System.out.println("Sorted short array: " + Arrays.toString(shortArr));
	}

}
