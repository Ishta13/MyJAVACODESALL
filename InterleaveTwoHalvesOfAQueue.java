import java.util.*;

public class InterleaveTwoHalvesOfAQueue {

    // Function to interleave first and second half of the queue
    public static void interleave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>(); // first half store karne ke liye
        int size = q.size();

        // Pehle half elements nikaal ke firstHalf queue me daal diye
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Interleaving start kiya: ek from firstHalf, ek from q (second half)
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // firstHalf se ek
            q.add(q.remove());         // original q ke second half se ek
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // Queue ka initialization

        // Queue me elements add kiye (1 to 10)
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        // Interleave call kiya
        interleave(q);

        // Final queue print ki
        while (!q.isEmpty()) {
            System.out.println(q.remove() + " "); // remove() se element nikaalte jaa rahe
            //pr peek se sirf dikhega //peek gives only 1 as ele
        }
    }
}
