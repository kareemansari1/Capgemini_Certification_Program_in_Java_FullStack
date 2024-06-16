package DoSelect;

import java.util.*;

public class SecondSmallest {

	int getSecondSmallest(int arr[]) {
		int temp;
		int total = arr.length;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1]; // Second smallest element after sorting
	}

	public static void main(String args[]) {
		SecondSmallest source = new SecondSmallest();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();

		// Reading integers until the input ends
		while (sc.hasNextInt()) {
			arrayList.add(sc.nextInt());
		}
		sc.close(); // Close the scanner

		// Convert ArrayList to int array
		int[] arr = arrayList.stream().mapToInt(i -> i).toArray();

		// Ensure there are at least two elements to find the second smallest
		if (arr.length < 2) {
			System.out.println("Not enough elements to find the second smallest.");
		} else {
			int result = source.getSecondSmallest(arr);
			System.out.println(result);
		}
	}
}
