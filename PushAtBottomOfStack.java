import java.util.*;

public class PushAtBottomOfStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);  // Base case: If empty, push directly
            return;
        }

        int top = s.pop(); // Remove the top element
        pushAtBottom(s, data); // Recursive call to reach bottom
        s.push(top); // Push back the stored top element
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Stack before inserting at bottom: " + s);
        pushAtBottom(s, 4);
        System.out.println("Stack after inserting 4 at bottom: " + s);
    }
}
