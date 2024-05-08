package collectionEx;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<String>();

        // Add elements to the LinkedList
        linkedList.add("Kareem");
        linkedList.add("Onkar");
        linkedList.add("Nitesh");
        linkedList.add("Sriveni");

        // Print the initial state of the LinkedList
        System.out.println("Initial LinkedList: " + linkedList);

        // Remove the first element from the LinkedList
        linkedList.poll();
        System.out.println("LinkedList after removing the first element: " + linkedList);

        // Retrieve, but does not remove, the first element of the LinkedList
        linkedList.peek();
        System.out.println("LinkedList after peeking (retrieving) the first element: " + linkedList);

        // Retrieve, but does not remove, the last element of the LinkedList
        linkedList.peekLast();
        System.out.println("LinkedList after peeking (retrieving) the last element: " + linkedList);

        // Remove the element at index 2 (third element)
        linkedList.remove(2);
        System.out.println("LinkedList after removing the element at index 2: " + linkedList);

        // Remove the last element from the LinkedList
        linkedList.pollLast();
        System.out.println("LinkedList after removing the last element: " + linkedList);
    }
}
