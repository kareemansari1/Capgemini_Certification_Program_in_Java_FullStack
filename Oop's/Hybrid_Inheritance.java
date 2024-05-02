package Oops;

class GFather {
	public void display() {
		System.out.println("Super Class");
	}
}

class FFather extends GFather {
	public void add() {
		int a = 10, b = 12;
		System.out.println("From Father Class, Addition is " + (a + b));
	}
}

class Uncle extends GFather {
	public void sub() {
		int a = 12, b = 2;
		System.out.println("From Uncle Class, Subtraction is " + (a - b));
	}
}

class Son extends Uncle {
	public void mul() {
		int a = 6, b = 5;
		System.out.println("From Son Class, Multiplication is " + (a * b));
	}
}

public class Hybrid_Inheritance {
	public static void main(String[] args) {
		GFather gf = new GFather();
		gf.display();

		FFather father = new FFather();
		father.add();

		Uncle uncle = new Uncle();
		uncle.sub();

		Son son = new Son();
		son.mul();
	}
}
