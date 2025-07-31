import java.util.*;

public class StackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
     //head ko initialize kra hai jaise krte hai initialize hr baar
       Node head = null;  // Should not be static

        public boolean isEmpty() {
            return head == null; // Check if stack is empty
        }

        public void push(int data) {
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int top = head.data;
            head = head.next; // Remove the top element
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;  // Return top element without removing it
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print top element
            s.pop(); // Remove top element
        }
    }
}
