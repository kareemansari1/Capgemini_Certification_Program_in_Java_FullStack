package Basic_Codes;

import java.util.Scanner;

public class smallest_of3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number ");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Number ");
		int num2 = sc.nextInt();
		System.out.println("Enter The Third Number ");
		int num3 = sc.nextInt();

		int result = findsmalest(num1, num2, num3);

		System.out.println("Smalest Number is: " + result);
	}

	private static int findsmalest(int num1, int num2, int num3) {
		if (num1 <= num2 && num1 <= num3) {
			return num1;
		} else if (num2 <= num1 && num2 <= num3) {
			return num2;
		} else {
			return num3;
		}

	}

}
