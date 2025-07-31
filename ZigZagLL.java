public class ZigZagLL {
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
    public void zigzag() {
        //find mid
        //if (head == null || head.next == null) return head; // Single element or empty list
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse
        Node curr = mid.next;
        mid.next = null; // breaking the ll
        Node prev=null; //kyuki head-1 = null
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node left=head;
        Node right=prev; //kyuki yhi at last curr bnega
        Node nextL,nextR;
        while(left!=null && right!=null)
        {
            nextL=left.next;  //
            left.next=right;//
            nextR=right.next;//
            right.next=nextL;//   zig-zag
            left=nextL;
            right=nextR; //update
        }
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigzag();
        ll.print();
    }

}
