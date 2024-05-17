package Basic_Codes;

public class MissingNumber {
    public static void main(String[] args) {
        // Define the array containing numbers from 1 to 10 with one missing number
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };

        // Calculate the sum of the range of numbers from 1 to 10 using the formula (n * (n + 1)) / 2
        // In this case, n = 10
        int sumOfRange = 10 * (10 + 1) / 2;

        // Calculate the sum of the numbers in the array
        int sumOfNumbers = 0;
        for (int num : numbers) {
            sumOfNumbers += num;
        }

        // Calculate the missing number by finding the difference between the sum of the range and the sum of the numbers
        int missingNumber = sumOfRange - sumOfNumbers;

        // Print the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}
