public class LinkedListAddFirstLastandTraversal {

    // Node class representing each element in the linked list
    public class Node {
        int data;  // data contained in the node
        Node next; // reference to the next node

        // Constructor for creating a new node with given data
        public Node(int data) {
            this.data = data;
            this.next = null; // next is null when the node is created
        }
    }

    public Node Head; // Head of the linked list
    public Node Tail; // Tail of the linked list

    // Method to add a new node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (Head == null) { // If the linked list is empty
            Head = Tail = newNode; // Both head and tail point to the new node
        } else {
            newNode.next = Head; // New node's next points to the current head
            Head = newNode; // Head now points to the new node
        }
    }

    // Method to add a new node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (Head == null) { // If the linked list is empty
            Head = Tail = newNode; // Both head and tail point to the new node
        } else {
            Tail.next = newNode; // Current tail's next points to the new node
            Tail = newNode; // Tail now points to the new node
        }
    }

    // Method to print the linked list
    public void print() {
        Node temp = Head; // Start from the head (to traverse list)
        while (temp != null) { // Traverse until the end of the list
            System.out.print(temp.data + "->"); // Print current node's data
            temp = temp.next; // Move to the next node to print next node's data
        }
        System.out.println("null"); // Indicate the end of the list
    }

    public static void main(String[] args) {
        LinkedListAddFirstLastandTraversal ll = new LinkedListAddFirstLastandTraversal();
        ll.print();
        ll.addFirst(12);
        ll.print(); // 12->null
        ll.addFirst(11);
        ll.print(); // 11->12->null
        ll.addFirst(10);
        ll.print(); // 10->11->12->null
        ll.addLast(14);
        ll.print(); // 10->11->12->14->null
        ll.addLast(15);
        ll.print(); // 10->11->12->14->15->null
        ll.addLast(16);
        ll.print(); // 10->11->12->14->15->16->null
    }
}
