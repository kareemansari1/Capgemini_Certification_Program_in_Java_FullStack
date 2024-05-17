package collectionEx;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> treeSet = new TreeSet<String>();

        // Add elements to the TreeSet
        treeSet.add("Kareem"); // TreeSet does not allow null values.
        treeSet.add("Kareem"); // This duplicate value will not be added.
        treeSet.add("Varad");
        treeSet.add("Zeba");
        treeSet.add("Nitesh");
        treeSet.add("Aman");
        treeSet.add("ankit");

        // Remove an element from the TreeSet
        treeSet.remove("Aman");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Print the TreeSet using an Iterator
        System.out.println("*****Using Iterator************");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // Print the TreeSet in descending order using a descending Iterator
        System.out.println("*****Using decreasing Iterator************");
        Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext())
            System.out.println(descendingIterator.next());
    }
}
