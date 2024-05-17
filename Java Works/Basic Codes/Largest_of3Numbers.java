package Basic_Codes;

import java.util.Scanner;

public class Largest_of3Numbers {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the first number
        System.out.println("Enter The First Number ");
        int num1 = sc.nextInt(); // Read the first number from the user
        
        // Ask the user to enter the second number
        System.out.println("Enter The Second Number ");
        int num2 = sc.nextInt(); // Read the second number from the user
        
        // Ask the user to enter the third number
        System.out.println("Enter The Third Number ");
        int num3 = sc.nextInt(); // Read the third number from the user

        // Call the findLargest function to find the largest number among the three numbers
        int result = findLargest(num1, num2, num3);

        // Print the result, which is the largest number among the three numbers
        System.out.println("Largest Number is: " + result);
        
        // Close the Scanner object to prevent resource leak
        sc.close();
    }

    // Function to find the largest number among three numbers
    private static int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) { // Check if num1 is greater than or equal to num2 and num3
            return num1; // If true, num1 is the largest number
        } else if (num2 >= num1 && num2 >= num3) { // Check if num2 is greater than or equal to num1 and num3
            return num2; // If true, num2 is the largest number
        } else {
            return num3; // If above conditions are false, num3 is the largest number
        }
    }
}
