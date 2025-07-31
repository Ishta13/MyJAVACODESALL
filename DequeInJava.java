import java.util.Deque;
import java.util.LinkedList;

public class DequeInJava {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();

        // ---------- LIFO operations (like a Stack) ----------
        // Elements added to the front, so last-in will be first-out
        d.addFirst(3); // Push 3
        d.addFirst(2); // Push 2
        d.addFirst(1); // Push 1
        System.out.println("After LIFO additions (Stack style): " + d);
        // Output: [1, 2, 3]

        // ---------- FIFO operations (like a Queue) ----------
        // Elements added to the rear, will come out in the same order
        d.addLast(4); // Enqueue 4
        d.addLast(5); // Enqueue 5
        d.addLast(6); // Enqueue 6
        System.out.println("After FIFO additions (Queue style): " + d);
        // Output: [1, 2, 3, 4, 5, 6]

        // ---------- Removing from both ends ----------
        d.removeFirst(); // Removes 1 (front) - FIFO-style dequeue
        d.removeLast();  // Removes 6 (rear) - LIFO-style pop
        System.out.println("After removals from both ends: " + d);
        // Output: [2, 3, 4, 5]

        // ---------- Accessing elements without removing ----------
        System.out.println("First (front): " + d.getFirst()); // 2
        System.out.println("Last (rear): " + d.getLast());   // 5
    }
}
