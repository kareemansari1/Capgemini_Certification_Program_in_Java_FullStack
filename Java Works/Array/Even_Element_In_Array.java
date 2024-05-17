package Array_Codes;

public class Even_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Element present in Even Positions is ");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i]+ " ");
		}

	}

}
