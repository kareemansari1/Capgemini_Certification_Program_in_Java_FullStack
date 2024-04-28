package Basic_Codes;

import java.util.Scanner;

public class Palindrome {

    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        int rev = 0, rem = 0;
        System.out.println("Enter The Number ");
        int num = sc.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome.checkPalindrome();
    }
}
