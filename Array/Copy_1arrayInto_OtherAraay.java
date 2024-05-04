package Array_Codes;

public class Copy_1arrayInto_OtherAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // Converting 2 array into 1 array.
		}

		System.out.println("Elements  of original Array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.println("Elements of new array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
