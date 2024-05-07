package collectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// Create an ArrayList of Strings
		ArrayList<String> arrayList = new ArrayList<String>();

		// Add elements to the ArrayList
		arrayList.add("Kareem");
		arrayList.add("Varad");
		arrayList.add("Nitesh");

		// Print the ArrayList
		System.out.println(arrayList);

		// Set an element at index 0
		arrayList.set(0, "Onkar");
		System.out.println(arrayList);

		// Get elements by index
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));

		// Check if ArrayList is empty
		System.out.println(arrayList.isEmpty());

		// Get the size of the ArrayList
		System.out.println(arrayList.size());

		// Remove an element at index 0
		arrayList.remove(0);
		System.out.println(arrayList);

		// Create another ArrayList
		ArrayList<String> arrayList1 = new ArrayList<String>();

		// Check if arrayList1 is empty
		System.out.println("Is Empty " + arrayList1.isEmpty());

		// Add all elements of arrayList to arrayList1
		arrayList1.addAll(arrayList);// Add all Elements.
		arrayList1.add("EduBridge");
		System.out.println(arrayList1);

		// Remove all elements of arrayList1
		arrayList1.removeAll(arrayList1);
		System.out.println(arrayList1);

		// Sort arrayList1
		Collections.sort(arrayList1);
		System.out.println(arrayList1);

		// Print elements of arrayList1 using for-each loop
		for (String list : arrayList1)
			System.out.print(list + " ");
		System.out.println();

		// Check if arrayList1 contains "Kareem123"
		System.out.println(arrayList1.contains("Kareem123"));

		// Iterate through the ArrayList using Iterator
		System.out.println("Iterator ");
		Iterator<String> iterator = arrayList.iterator();

		System.out.println("List elements : ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.println();

	}
}
