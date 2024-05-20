package Java8Features;

// Functional interface for addition
@FunctionalInterface
interface Myinterface {
	int add(int a, int b);
}

// Functional interface for multiplication
@FunctionalInterface
interface MyinterfaceMul {
	int mul(int a, int b);
}

// Functional interface for reversing a string
@FunctionalInterface
interface ReverseString {
	String rev(String s);
}

// Functional interface for checking even or odd
@FunctionalInterface
interface EvenOdd {
	String evenodd(int num);
}

public class LambdaWithParameter {

	public static void main(String[] args) {
		// Lambda expression for addition
		Myinterface myinterface = (int a, int b) -> a + b;
		System.out.println("Addition is : " + myinterface.add(2, 3));

		// Lambda expression for multiplication
		MyinterfaceMul myInterface1 = (int a, int b) -> a * b;
		System.out.println("Multiplication is : " + myInterface1.mul(3, 3));

		// Lambda expression for reversing a string
		ReverseString reverseString = (String s) -> {
			String str = " ";
			for (int i = s.length() - 1; i >= 0; i--) {
				char ch = s.charAt(i);
				str = str + ch;
			}
			return str;
		};
		System.out.println("My Reverse String is : " + reverseString.rev("Kareem"));

		// Lambda expression for checking even or odd
		EvenOdd even = (int num) -> (num % 2 == 0) ? "Even" : "Odd";
		System.out.println("Number 4 is " + even.evenodd(4)); // Output: Even
		System.out.println("Number 7 is " + even.evenodd(7)); // Output: Odd
	}
}
