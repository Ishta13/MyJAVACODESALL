import java.util.Stack;

public class DuplicateParantheses {
    public static boolean dupleParan(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Closing Bracket: Check for duplicate
            if (ch == ')') {
                int count = 0;

                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // Duplicate found
                }

                // IMPORTANT: pop the opening '('
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                // Push every character including '('
                s.push(ch);
            }
        }
        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";         // Expected: true (Duplicate)
        String str2 = "(a+(b+c))";       // Expected: false (No Duplicate)
        String str3 = "((a+b)+(c+d))";   // Expected: false (No Duplicate)

        System.out.println(dupleParan(str1)); // Output: true
        System.out.println(dupleParan(str2)); // Output: false
        System.out.println(dupleParan(str3)); // Output: false
    }
}
