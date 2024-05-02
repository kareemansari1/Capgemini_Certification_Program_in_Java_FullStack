package Oops;

// AbstractClasss is an abstract class
abstract class AbstractClasss {
	// Abstract method declaration (no implementation)
	abstract void display();

	// Non-abstract method with implementation
	void msg() {
		System.out.println("Message Method");
	}
}

// Abstact1 is a concrete class inheriting from AbstractClasss
class Abstact1 extends AbstractClasss {
	// Override the abstract method display() and provide implementation
	@Override
	void display() {
		System.out.println("Display method");
	}
}

// Main class
public class AbstractClass {
	public static void main(String[] args) {
		// Create an instance of Abstact1
		Abstact1 a = new Abstact1();
		// Call the display method, which was overridden in Abstact1
		a.display();
		// Call the message method, which is inherited from AbstractClasss
		a.msg();
	}
}
