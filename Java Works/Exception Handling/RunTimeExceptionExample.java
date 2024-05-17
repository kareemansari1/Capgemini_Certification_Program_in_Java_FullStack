package exception;

public class RunTimeExceptionExample {

	public static void main(String[] args) {
		try {
			// code
			int a[] = { 2, 3, 4 };
			System.out.println("Length of my array: " + a.length);
			System.out.println("Array Element:" + a[2]);
			int c = 20 / 5;
			System.out.println("Element C:" + c);
			String s = "123";
			int ss = Integer.parseInt(s);
			System.out.println("Value of ss: " + ss);
			// The below lines will throw NumberFormatException if uncommented
			String s1 = "abc";
			int sss = Integer.parseInt(s1);// abc can not convert into number
			System.out.println("Value of ss: " + sss);
			// The below lines will throw NullPointerException if uncommented
			int a1[] = null;
			System.out.println("The length of the array arr is: " + a1.length);
			String st2 = null;
			System.out.println("The length of the array arr is: " + st2.length());
			// The below line will throw NegativeArraySizeException
			int[] array = new int[-5];
			System.out.println("Array length: " + array.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds: " + e.getMessage());
		} catch (ArithmeticException e1) {
			System.out.println("Arithmetic Exception occurred: " + e1.getMessage());
		} catch (NumberFormatException e2) {
			System.out.println("Number Format Exception occurred: " + e2.getMessage());
		} catch (NullPointerException e3) {
			System.out.println("Null Pointer Exception occurred: " + e3.getMessage());
		} catch (NegativeArraySizeException e4) {
			System.out.println("Negative Array Size Exception occurred: " + e4.getMessage());
		}
	}

}
