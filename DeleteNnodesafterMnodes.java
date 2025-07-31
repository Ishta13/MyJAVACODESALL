public class DeleteNnodesafterMnodes {
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

    // Function to delete N nodes after every M nodes
    public void linkedelete(Node head, int M, int N) {
        int count = 0;
        Node curr = head;

        while (curr != null && curr.next != null) {
            count++;  /////////to count M 
            int x = N;  ////////to get N nodes

            if (count == M) {  /////////if count === M to reach after M nodes
                while (x > 0 && curr.next != null) { //////remove N nodes safely
                    curr.next = curr.next.next;
                    x--;
                }
                count = 0; // Reset count after deleting N nodes
            }

            curr = curr.next; // Move to the next node
        }
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

    // Main function (psvm)
    public static void main(String[] args) {
        DeleteNnodesafterMnodes list = new DeleteNnodesafterMnodes();

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);

        System.out.println("Original List:");
        list.printList();

        // Deleting 2 nodes after every 3 nodes
        list.linkedelete(list.head, 3, 2);

        System.out.println("Modified List after deleting 2 nodes after every 3 nodes:");
        list.printList();
    }
}
