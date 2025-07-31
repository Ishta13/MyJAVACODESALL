import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingTheFirstKElementsOfAQueue {
    public static void reverse(Queue <Integer> q,int k)
    {
        Stack <Integer> s = new Stack<>();
         if (q == null || k > q.size() || k < 0) return;
         // Step 1: Push first K elements to stack
         for(int i=0;i<k;i++)
         {
            s.push(q.remove());
         }
          // Step 2: Enqueue the elements from stack
         while(!s.isEmpty())
         {
            q.add(s.pop());
         }
         int size = q.size();
         for(int i=0;i<size-k;i++)
         {
             // Step 3: Rotate the rest of the queue
            q.add(q.remove());
         }

    }
    public static void main(String[] args) {
         // Creating a queue and adding elements
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i=0;i<10;i++) {
            queue.add(i);
        }
        int k = 5;
        System.out.println("Original queue: " + queue);
        reverse(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + queue);
    }
}
