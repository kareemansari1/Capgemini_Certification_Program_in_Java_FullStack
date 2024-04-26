package Array;

import java.util.Scanner;

public class ArrayMatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size ");
		int size = sc.nextInt();
		int a[][] = new int[size][size];
		int b[][] = new int[size][size];
		int c[][] = new int[size][size];

		System.out.println("Enter The First Matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter The Second Matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				c[i][j] = 0;
				for (int k = 0; k < size; k++) {

					c[i][j] += a[i][k] * b[k][j];
				}

			}

		}
		System.out.println();
		System.out.println("Matrix After Multiplication ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");

		}

	}

}
