package Basic_Codes;

import java.util.Scanner;

public class ASCII_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Char ");
		char chr= sc.next().charAt(0);
		int asciiValue = chr;
		System.out.println("ASCII Value of "+chr+" is "+asciiValue);

	}

}
