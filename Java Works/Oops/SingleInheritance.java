package Oops;

class parent {
	public void add() {
		int a = 10, b = 20;
		System.out.println("Parent Class Addition is  " + (a + b));
	}
}

class Child extends parent {
	public void sub() {
		int a = 20, b = 10;
		System.out.println("Child class Substraction is " + (a - b));
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.add();
		child.sub();

	}

}
