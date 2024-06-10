package basic_Codes;

import java.util.Scanner;

public class Single_Number_Finder {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array elements
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the single number
        int singleNumber = findSingleNumber(arr);
        System.out.println("The single number is: " + singleNumber);

        scanner.close();
    }
}