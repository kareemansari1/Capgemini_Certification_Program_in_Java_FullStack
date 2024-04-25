package Array;

public class ArrayStringName {
    public static void main(String[] args) {
        // Array of strings containing names
        String str[] = { "Kareem", "Pooja", "Nitesh" };

        // Loop to print each element of the string array
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " "); // Print each name followed by a space
        }
        System.out.println(); // Move to the next line after printing all names

        // Enhanced for loop to print each element of the string array
        for (String str1 : str) {
            System.out.println(str1); // Print each name on a new line
        }
        System.out.println(); // Move to the next line after printing all names

        // Array of integers
        int arr[] = { 1, 2, 3 };

        // Loop to print each element of the integer array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each number followed by a space
        }
    }
}
