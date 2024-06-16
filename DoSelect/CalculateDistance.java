package DoSelect;

import java.util.Scanner;

// Class name should be "Source",
// otherwise solution won't be accepted
public class CalculateDistance {

	public static void calculateDistance(int t1, int t2) {
		int u = 10; // initial velocity in m/s
		int a = 5; // acceleration in m/s^2
		int distanceTravel1 = u * t1 + ((a * t1 * t1) / 2);
		int distanceTravel2 = u * t2 + ((a * t2 * t2) / 2);
		System.out.println(distanceTravel1);
		System.out.println(distanceTravel2);
	}

	public static void main(String args[]) throws Exception {
		int firstValue;
		int secondValue;
		Scanner sc = new Scanner(System.in);
		firstValue = sc.nextInt();
		secondValue = sc.nextInt();
		calculateDistance(firstValue, secondValue);
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}
