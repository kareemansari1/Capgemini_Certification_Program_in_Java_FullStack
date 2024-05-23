package Stream;

import java.util.Arrays;
import java.util.List;

// Class representing a person with name and age attributes
class Person {
	String name;
	int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for age
	public void setAge(int age) {
		this.age = age;
	}

	// toString method for printing person details
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class AvgAgeStream {
	public static void main(String[] args) {
		// Creating a list of Person objects
		List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 35));

		// Calculating the average age of persons using streams
		double averageAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);

		// Printing the average age
		System.out.println("Average Age: " + averageAge);
	}
}
