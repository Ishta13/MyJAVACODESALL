import java.util.*;

public class StackUsingArrayList {
    static class Stack {
        ArrayList<Integer> a = new ArrayList<>();

        boolean isEmpty() {
            return a.size() == 0;
        }

        void push(int data) {
            a.add(data);  // Add at the top of the stack
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int top = a.get(a.size() - 1); // Get top element
            a.remove(a.size() - 1);  // Remove top element
            return top;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return a.get(a.size() - 1);  // Get top element
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println("Peek: " + s.peek()); // Should print 2
        System.out.println("Pop: " + s.pop()); // Should print 2
        System.out.println("Peek after pop: " + s.peek()); // Should print 1
    }
}
