package collectionEx;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		// Pushing elements onto the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);

		// Popping elements from the stack
		int poppedElement = stack.pop();
		System.out.println("Popped element: " + poppedElement);

		// Peeking at the top element of the stack
		int topElement = stack.peek();
		System.out.println("Top element: " + topElement);

		// Checking if the stack is empty
		boolean isEmpty = stack.isEmpty();
		System.out.println("Is stack empty? " + isEmpty);

		// Getting the size of the stack
		int size = stack.size();
		System.out.println("Size of stack: " + size);

	}

}
