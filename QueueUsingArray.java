public class QueueUsingArray {
    public static class Queue {
        int rear;
        int size;
        int[] arr;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;   ///increment
            arr[rear] = data; //////get data
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];    ////////////initialize first 

            // Shift elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear=rear-1; // Reduce size
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0]; // Front element
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); ///////for new queue static required
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print front element
            q.remove(); // Remove front element
        }
    }
}
