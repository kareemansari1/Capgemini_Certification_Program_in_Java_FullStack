package exception;

public class ArithmaticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			int arr[] = { 2, 3, 4 };
			System.out.println("Value of C is " + c);
			System.out.println("Array " + arr[5]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e1) {
			// TODO: handle exception
			System.out.println(e1.getMessage());
		} finally {
			System.out.println("End of the code");
		}

	}

}
