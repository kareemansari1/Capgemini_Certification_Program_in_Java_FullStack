package Oops;

class GrandFather {
	public void add() {
		int a = 10, b = 20;
		System.out.println("Grand Father Class Addition is " + (a + b));
	}
}

class Father extends GrandFather {
	public void sub() {
		int a = 20, b = 12;
		System.out.println("Father Class Substraction is " + (a + b));
	}
}

class Child1 extends Father {
	public void mul() {
		int a = 5, b = 7;
		System.out.println("Child Class Multiplication is " + (a * b));
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Father father = new Father();
		Child1 child = new Child1();
		child.add();
		child.sub();
		child.mul();
	}

}
