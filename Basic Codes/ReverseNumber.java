package Basic_Codes;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void revNumFun(int num) {
		int  rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;

		}
		System.out.println("Reverse Number is "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int num=sc.nextInt();
		revNumFun(num);

	}

}
