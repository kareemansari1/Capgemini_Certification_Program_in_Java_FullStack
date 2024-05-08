package collectionEx;

import java.util.HashSet;

public class HashSetOperations {

    public static void main(String[] args) {
        // Create a HashSet of Integers
        HashSet<Integer> hashSet = new HashSet<Integer>();

        // Add even numbers to the HashSet
        hashSet.add(12);
        hashSet.add(14);
        hashSet.add(16);
        hashSet.add(1); // HashSet follows a random sequence.

        // Print the HashSet of even numbers
        System.out.println("Even Numbers: " + hashSet);

        // Create another HashSet of Integers for odd numbers
        HashSet<Integer> hashSet1 = new HashSet<Integer>();

        // Add odd numbers to the HashSet
        hashSet1.add(1); // HashSet does not print duplicate values.
        hashSet1.add(3);
        hashSet1.add(5);

        // Print the HashSet of odd numbers
        System.out.println("Odd Numbers: " + hashSet1);

        // Perform set operations

        // Union Operation (addAll)
         hashSet1.addAll(hashSet);
         System.out.println("UNION "+hashSet1);

        // Intersection Operation (retainAll)
         hashSet1.retainAll(hashSet);
         System.out.println("INTERSECTION "+hashSet1);

        // Difference Operation (removeAll)
        hashSet1.removeAll(hashSet); // This operation prints the difference between two HashSets,
                                      // i.e., elements that are only present in hashSet1 and not in hashSet.
        System.out.println("DIFFERENCE: " + hashSet1);
    }

}
