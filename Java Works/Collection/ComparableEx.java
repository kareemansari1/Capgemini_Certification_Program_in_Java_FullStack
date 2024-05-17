package collectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class implementing Comparable interface to demonstrate sorting based on name
public class ComparableEx implements Comparable<ComparableEx> {
	private String name;
	private int sal; // Salary

	// Constructor to initialize ComparableEx objects
	public ComparableEx(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}

	// Method to display ComparableEx object as a string
	@Override
	public String toString() {
		return "ComparableEx [name=" + name + ", sal=" + sal + "]";
	}

	// Method to compare ComparableEx objects based on name
	@Override
	public int compareTo(ComparableEx o) {
		return this.name.compareTo(o.name);
	}

	public static void main(String[] args) {
		List<ComparableEx> comparableExs = new ArrayList<ComparableEx>();
		comparableExs.add(new ComparableEx("Kareem", 2000));
		comparableExs.add(new ComparableEx("Mazhar", 1000));
		comparableExs.add(new ComparableEx("Adnan", 1500));

		// Sort ComparableEx objects by name
		System.out.println("Sort By Name");
		Collections.sort(comparableExs);
		for (ComparableEx e : comparableExs) {
			System.out.println(e);
		}
	}
}
