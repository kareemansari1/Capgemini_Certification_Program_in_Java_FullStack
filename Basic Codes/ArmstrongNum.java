package Basic_Codes;

import java.util.Scanner;

public class ArmstrongNum {
    Scanner sc = new Scanner(System.in);

    // Method to check if a number is an Armstrong number
    public void checkArmstrongFun() {
        System.out.println("Enter The Number ");
        int num = sc.nextInt();
        int rem = 0, sum = 0;
        int temp = num;
        
        // Calculate the sum of cubes of each digit
        while (num != 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        
        // Check if the original number is equal to the sum of cubes of its digits
        if (temp == sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is Not Armstrong");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the ArmstrongNum class
        ArmstrongNum arm = new ArmstrongNum();
        // Call the checkArmstrongFun method to check for Armstrong number
        arm.checkArmstrongFun();
    }
}
