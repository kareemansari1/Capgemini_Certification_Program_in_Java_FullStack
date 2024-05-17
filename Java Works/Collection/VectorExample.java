package collectionEx;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Create a Vector of Strings
		Vector<String> vector = new Vector<String>();

		// Add elements to the Vector
		vector.add("Kareem");
		vector.add("Varad");
		vector.add("Nitesh");

		// Print the initial state of the Vector
		System.out.println("Initial Vector: " + vector);

		// Modify an element at index 0
		vector.set(0, "Onkar");
		System.out.println("Vector after modifying element at index 0: " + vector);

		// Retrieve elements at specific indices
		System.out.println("Element at index 0: " + vector.get(0));
		System.out.println("Element at index 1: " + vector.get(1));

		// Check if the Vector is empty
		System.out.println("Is Vector empty? " + vector.isEmpty());

		// Get the size of the Vector
		System.out.println("Size of Vector: " + vector.size());

		// Remove an element at index 0
		vector.remove(0);
		System.out.println("Vector after removing element at index 0: " + vector);

		// Create a new Vector
		Vector<String> vector1 = new Vector<String>();

		// Check if the new Vector is empty
		System.out.println("Is Vector1 empty? " + vector1.isEmpty());

		// Add all elements from 'vector' to 'vector1'
		vector1.addAll(vector);
		vector1.add("EduBridge");
		System.out.println("Vector1 after adding elements from Vector and 'EduBridge': " + vector1);

		// Sort the elements of 'vector1'
		Collections.sort(vector1);

		// Print the sorted elements of 'vector1' using for-each loop
		System.out.print("Sorted elements of Vector1: ");
		for (String list : vector1)
			System.out.print(list + " ");
		System.out.println();

		// Check if 'vector1' contains a specific element
		System.out.println("Does Vector1 contain 'Kareem123'? " + vector1.contains("Kareem123"));

		// Demonstrate Enumeration
		System.out.println("Enumeration:");
		Enumeration<String> enumobject = vector1.elements();
		System.out.println("Data in enumeration object is: ");
		while (enumobject.hasMoreElements()) {
			System.out.println("Element: " + enumobject.nextElement());
		}

		// Demonstrate Iterator
		System.out.println("Iterator:");
		Iterator<String> iterator = vector1.iterator();
		System.out.println("List elements: ");
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
	}
}
