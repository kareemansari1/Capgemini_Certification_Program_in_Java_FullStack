package Java8Features;

// Functional interfaces with lambda expressions

// Functional interface with two parameters and a return value
@FunctionalInterface
interface MyFunction {
	int apply(int param1, int param2);
}

// Functional interface with one parameter and no return value
@FunctionalInterface
interface MyConsumer<T> {
	void accept(T t);
}

// Functional interface with one parameter and a return value
@FunctionalInterface
interface MyFunction1 {
	int apply(int param);
}

// Functional interface with two parameters and a return value
@FunctionalInterface
interface MyBiFunction {
	int apply(int param1, int param2);
}

// Functional interface with no parameters and a return value
@FunctionalInterface
interface MySupplier {
	int get();
}

// Functional interface with no parameters and no return value
@FunctionalInterface
interface MyRunnable {
	void run();
}

public class LambdaExpression {
	public static void main(String[] args) {
		// Lambda expressions demonstration

		// Lambda expression for MyFunction
		MyFunction customFunction = (int param1, int param2) -> {
			// ** Multiple parameters and multiple lines in the body **
			int result = param1 * param2;
			System.out.println("Result: " + result);
			return 0;
		};

		// Call the lambda expression
		System.out.println(customFunction.apply(5, 3));

		// Lambda expression for MyConsumer
		MyConsumer<String> myConsumer = (String parameter) -> {
			// Multiple lines in the body
			System.out.println("Statement 1 with parameter: " + parameter);
			System.out.println("Statement 2 with parameter: " + parameter);
		};

		// Call the lambda expression
		myConsumer.accept("Hello");

		// Lambda expression for MyFunction1
		MyFunction1 lambda = parameter -> parameter * parameter;

		// Call the lambda expression
		System.out.println(lambda.apply(5));

		// Lambda expression for MyBiFunction
		MyBiFunction lambda1 = (param1, param2) -> param1 * param2;

		// Call the lambda expression
		System.out.println(lambda1.apply(5, 3));

		// Lambda expression for MySupplier
		MySupplier lambda2 = () -> 42;

		// Call the lambda expression
		System.out.println(lambda2.get());

		// Lambda expression for MyRunnable
		MyRunnable lambda3 = () -> {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};

		// Call the lambda expression
		lambda3.run();
	}
}
