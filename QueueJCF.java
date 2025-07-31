import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  // Create a queue

        /////////or can use ArrayDeque
        // Add elements
        q.add(1);
        q.add(2);
        q.add(3);

        // Print and remove elements
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print front element
            q.remove();  // Remove front element
        }
    }
}
