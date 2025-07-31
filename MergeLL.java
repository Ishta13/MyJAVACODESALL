public class MergeLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public static int size = 0;

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Find the middle node of the linked list
    public Node mid(Node head) {
        if (head == null || head.next == null) return head; // Single element or empty list
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1); // Dummy node
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Add remaining nodes
        if (head1 != null)
         temp.next = head1;
        else if(head2 != null)
         temp.next = head2;

        return mergeLL.next; // Skip the dummy node
    }

    // Merge Sort implementation
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) return head; // Base case

        // Find the middle and split the list
        Node mid = mid(head);
        Node rightHead = mid.next;
        mid.next = null; // Split the list

        // Recursive sorting
        Node leftSorted = mergeSort(head);
        Node rightSorted = mergeSort(rightHead);

        // Merge sorted halves
        return merge(leftSorted, rightSorted);
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeLL ll = new MergeLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(45);
        ll.addFirst(7);
        ll.addFirst(10);
        ll.addFirst(5);

        System.out.println("Original List:");
        ll.print();

        ll.head = ll.mergeSort(ll.head); // Sorting the linked list

        System.out.println("Sorted List:");
        ll.print();
    }
}
