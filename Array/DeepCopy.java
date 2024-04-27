package Array;

public class DeepCopy {
	/*
	 * Deep copy(Single dimension array) means a variable would have a copy of the
	 * original array in a different memory location.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		int cloneArray[][] = arr.clone();
		System.out.println(arr[0] == cloneArray[0]);
		System.out.println(arr[1] == cloneArray[1]);
	}

}
