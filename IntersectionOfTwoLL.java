public class IntersectionOfTwoLL {
    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Add a node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Get the length of a linked list
    public int getLength(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    // Find intersection point of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);
        int diff = Math.abs(len1 - len2);

        // Move the pointer of the longer list ahead by 'diff' nodes
        Node ptr1 = head1;
        Node ptr2 = head2;

        if (len1 > len2) {
            for (int i = 0; i < diff; i++) {
                ptr1 = ptr1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                ptr2 = ptr2.next;
            }
        }

        // Move both pointers one step at a time until they meet
        while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2) {
                return ptr1; // Intersection found
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return null; // No intersection
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IntersectionOfTwoLL list1 = new IntersectionOfTwoLL();
        IntersectionOfTwoLL list2 = new IntersectionOfTwoLL();

        // Creating first linked list
        list1.addFirst(10);
        list1.addFirst(20);
        list1.addFirst(30);
        list1.addFirst(40);

        // Creating second linked list
        list2.addFirst(15);
        list2.addFirst(25);

        // Creating intersection manually (list2 joins list1 at node "30")
        list2.head.next.next = list1.head.next; 

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        // Finding intersection
        Node intersection = list1.findIntersection(list1.head, list2.head);
        if (intersection != null) {
            System.out.println("Intersection found at node: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
