package Array;

import java.util.Scanner;

public class Array_2Dimension {
    // Method to input and display a 2D array
    public void Arr2d() {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3]; // Initialize a 2D array with dimensions 3x3
        System.out.println("Enter the Elements");
        
        // Input elements into the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Iterate through columns of each row
                arr[i][j] = sc.nextInt(); // Input element at position (i, j)
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // Display the 2D array
        System.out.println("Two Dimensional Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Iterate through columns of each row
                System.out.print(arr[i][j] + " "); // Print the element at position (i, j)
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Array_2Dimension ad = new Array_2Dimension(); // Create an instance of the class
        ad.Arr2d(); // Call the method to input and display the 2D array
    }
}
