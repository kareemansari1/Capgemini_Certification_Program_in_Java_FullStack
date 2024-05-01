package Oops;

class Student {
	public void display() {
		System.out.println("Student from Super Class ");
	}

}

class Science extends Student {
	public void sci() {
		System.out.println("Science Student from Base 1 class");
	}
}

class Commerce extends Student {
	public void comm() {
		System.out.println("Commerce Student from Base 2 class");
	}
}

class Arts extends Student {
	public void arts() {
		System.out.println("Arts Student from Base 3 class");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.display();
		Science sciencestudent = new Science();
		Commerce commercestudent = new Commerce();
		Arts artsstudent = new Arts();
		sciencestudent.sci();
		commercestudent.comm();
		artsstudent.arts();

	}

}
