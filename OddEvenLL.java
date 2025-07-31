public class OddEvenLL {
    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Function to segregate even and odd numbers in a linked list
    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) return head;

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;

        while (current != null) {
            if (current.data % 2 == 0) { // Even value
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            } else { // Odd value
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = current.next;
        }

        // If there are no even numbers, return odd list
        if (evenHead == null) return oddHead;

        // If there are no odd numbers, return even list
        if (oddHead == null) return evenHead;

        // Merge even and odd lists
        evenTail.next = oddHead;
        oddTail.next = null;

        return evenHead;
    }

    // Print linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {
        OddEvenLL list = new OddEvenLL();
        
        // Adding elements to the linked list
        list.addLast(8);
        list.addLast(12);
        list.addLast(10);
        list.addLast(5);
        list.addLast(4);
        list.addLast(1);
        list.addLast(6);

        System.out.println("Original List:");
        printList(list.head);

        list.head = oddEvenList(list.head);

        System.out.println("Modified List:");
        printList(list.head);
    }
}
