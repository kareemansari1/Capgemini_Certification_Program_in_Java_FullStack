package collectionEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// Create a HashSet of Strings
		HashSet<String> hashSet = new HashSet<String>();

		// Add elements to the HashSet
		hashSet.add("Kareem"); // HashSet does not allow duplicate values.
		hashSet.add("Kareem"); // This duplicate value will not be added.
		hashSet.add(null); // Only one null value is allowed in HashSet.
		hashSet.add("Varad");
		hashSet.add("Zeba"); // HashSet will store elements in a random order.
		hashSet.add("Nitesh");
		hashSet.add("Aman");
		hashSet.add("ankit");

		// Print the HashSet
		System.out.println("HashSet: " + hashSet);

		// Print the HashSet using an Iterator
		System.out.println("*****Using Iterator************");
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}
}
