import java.util.*;
public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node front = null;
        static Node rear = null;

        public static boolean isEmpty() {
            return rear == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (rear == null) { // If queue is empty
                front = rear = newNode;
            } else {
                rear.next = newNode; // Link new node to rear
                rear = newNode; // Update rear
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int ele = front.data; // Store front data
            front = front.next; // Move front to the next node
            if (front == null) { // If queue becomes empty
                rear = null;
            }
            return ele;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data; // Return front element
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
            if (!q.isEmpty()) { // Ensure peek() is only called if queue is NOT empty
                System.out.println(q.peek());
            }
        }
    }
}

