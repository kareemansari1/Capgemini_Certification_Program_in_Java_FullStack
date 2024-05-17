package Basic_Codes;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year ");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0||year%400==0) {
			System.out.println(year+ " is leap year");
		}
		else
		{
			System.out.println(year+ " Is not Leap Year");
		}
		
}
}