import java.util.*;
public class QueueUsingTwoStacks {
    public static class Queue{ /////jb yha static likhoge tbhi neeche  psvm me new queue use
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();
        /* 
 This method checks whether the stack is empty by using s1.isEmpty(),
 which already returns a boolean value (true or false).

 ✅ Instead of writing:
     if (s1.isEmpty()) {
         return true;
     } else {
         return false;
     }

 You can directly write:
     return s1.isEmpty();

 🔎 Why?
 Because s1.isEmpty() itself returns a boolean.
 So there’s no need to use if-else — the shorter version is cleaner, more efficient, and does the same job.
*/

        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public static void add(int data)
        {
           while(!s1.isEmpty())
           {
               s2.push(s1.pop());
           }
           s1.push(data);
           while(!s2.isEmpty())
           {
               s1.push(s2.pop());
           }

        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return -1;
            }
            return s1.pop();   //////////remove element
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return -1;
            }
            return s1.peek();   //////////get top elements
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(); ////////write static upr queue ke saath
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
