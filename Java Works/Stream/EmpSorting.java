package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	int sal;
	String name;
	String designation;

	// Constructor to initialize Emp objects
	public Emp(int sal, String name, String designation) {
		this.sal = sal;
		this.name = name;
		this.designation = designation;
	}

	// Overriding toString method for better representation of Emp objects
	@Override
	public String toString() {
		return "Emp [sal=" + sal + ", name=" + name + ", designation=" + designation + "]";
	}

	// Getter and setter methods for the Emp class properties
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

public class EmpSorting {

	public static void main(String[] args) {
		// Creating a list of Emp objects
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(50000, "John", "Manager"));
		a1.add(new Emp(30000, "Alice", "Developer"));
		a1.add(new Emp(40000, "Bob", "Developer"));

		// Sorting employees by designation
		System.out.println("Sort employees by designation:");
		a1.stream().sorted((e1, e2) -> e1.getDesignation().compareTo(e2.getDesignation())).forEach(System.out::println);

		// Sorting employees by employee name
		System.out.println("Sort employees by employee name:");
		List<Emp> sorted = a1.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList());
		System.out.println(sorted);
	}
}
