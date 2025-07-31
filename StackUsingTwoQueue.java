import java.util.*;

public class StackUsingTwoQueue {
    // Stack banayi gayi hai using 2 Queues
    public static class Stack {
        // Dono queues declare kar rahe hain
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Agar dono queues empty hain to stack bhi empty hoga
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty(); 
        }

        // Push operation: jis queue mein element already hai, usi mein naya element add karte hain
        public static void push(int data) {
            if (!q1.isEmpty()) {  // ✅ q1 mein already data hai, use continue karo
                q1.add(data); // Agar q1 khaali nahi hai to usi mein daal do
            } else {     // ✅ q1 khaali hai, to q2 mein daal do
                q2.add(data); // Warna q2 mein daal do
            }
        }

        // Pop operation: stack ke last inserted element ko remove karna hai (LIFO)
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1; // Yeh variable last element ko store karega jo return hoga

            // Agar q1 khaali nahi hai to usmein se last element tak sabko q2 mein shift karo
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove(); // ek ek element hatao
                    if (!q1.isEmpty()) {
                        q2.add(top); // sirf last element ko chod ke baaki q2 mein daal do
                    }
                }
            } else {
                // Agar q2 khaali nahi hai to usmein se last element tak sabko q1 mein shift karo
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (!q2.isEmpty()) {
                        q1.add(top);
                    }
                }
            }

            return top; // Jo last element bacha tha wahi stack ka top hoga, usi ko return kiya
        }

        // Peek operation: top element dekhna hai bina hataaye
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1; // Top element ko store karega

            // q1 se saare elements q2 mein daal do, aur har baar last removed ko top mein store karo
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top); // is baar last element bhi q2 mein daal dena (kyunki peek hai pop nahi)
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top; // Return karo top element jo stack ke last inserted tha
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(); // Stack ka object banaya

        s.push(1);  // Push 1
        s.push(2);  // Push 2
        s.push(3);  // Push 3

        System.out.println(s.peek()); // 3 dikhna chahiye (top element)
        System.out.println(s.pop());  // 3 remove hoke print hoga
        System.out.println(s.pop());  // 2 remove hoke print hoga
        System.out.println(s.pop());  // 1 remove hoke print hoga
        System.out.println(s.pop());  // Stack empty, -1 return hoga
    }
}
