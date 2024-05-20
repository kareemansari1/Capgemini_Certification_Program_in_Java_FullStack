package Java8Features;

// Interfaces MyInterface1 and MyInterface2 define abstract methods along with default and static methods
interface MyInterface1 {
	// Abstract method declaration
	void msg();

	// Default method declaration
	default void display() {
		System.out.println("Default Method of Interface");
	}

	// Static method declaration
	static void displaystatic() {
		System.out.println("Static Display Method ");
	}
}

interface MyInterface2 {
	// Abstract method declaration
	void msg2();
}

public class DefaultStatic implements MyInterface1, MyInterface2 {
	public static void main(String[] args) {
		// Creating an instance of DefaultStatic class
		DefaultStatic d = new DefaultStatic();

		// Invoking methods of interfaces implemented by DefaultStatic class
		d.msg(); // Invoking abstract method of MyInterface1
		d.msg2(); // Invoking abstract method of MyInterface2
		d.display(); // Invoking default method of MyInterface1
		MyInterface1.displaystatic(); // Invoking static method of MyInterface1
	}

	@Override
	public void msg2() {
		// Implementing abstract method of MyInterface2
		System.out.println("My abstract method of interface MyInter2");
	}

	@Override
	public void msg() {
		// Implementing abstract method of MyInterface1
		System.out.println("My abstract method of interface MyInter1");
	}
}
