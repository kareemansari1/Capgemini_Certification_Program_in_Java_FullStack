package Array;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter the size of the array
		System.out.println("Enter The Size of Array ");
		int size = sc.nextInt(); // Read the size of the array from the user

		// Create an array with the specified size
		int arr[] = new int[size];

		// Ask the user to enter the elements of the array
		System.out.println("Enter The Elements ");
		// Iterate over the array to read each element from the user
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // Read the element from the user and store it in the array

		}
		System.out.println("My single Dimension Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		// Close the Scanner object to prevent resource leak
		sc.close();
	}
}
