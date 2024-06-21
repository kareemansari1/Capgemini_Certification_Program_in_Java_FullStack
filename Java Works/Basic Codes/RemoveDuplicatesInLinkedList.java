package basic_Codes;

public class RemoveDuplicatesInLinkedList {

	// Represent a node of the singly linked list
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Represent the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;

	// addNode() will add a new node to the list
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// removeDuplicate() will remove duplicate nodes from the list
	public void removeDuplicate() {
		Node current = head;
		while (current != null) {
			Node temp = current;
			Node index = current.next;
			while (index != null) {
				if (current.data == index.data) {
					temp.next = index.next; // Skip the duplicate node
				} else {
					temp = index; // Move temp to the next node
				}
				index = index.next;
			}
			current = current.next;
		}
	}

	// display() will display all the nodes present in the list
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RemoveDuplicatesInLinkedList sList = new RemoveDuplicatesInLinkedList();
		// Add data to the list
		sList.addNode(1);
		sList.addNode(2);
		sList.addNode(3);
		sList.addNode(2);
		sList.addNode(2);
		sList.addNode(4);
		sList.addNode(1);

		System.out.println("Original list: ");
		sList.display();

		// Remove duplicate nodes
		sList.removeDuplicate();

		System.out.println("List after removing duplicates: ");
		sList.display();
	}
}
