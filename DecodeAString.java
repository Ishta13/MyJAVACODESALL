import java.util.*;

public class DecodeAString {
    public static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int count = 0;
        String curr = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0'); // Handle multi-digit numbers
            } 
            else if (c == '[') { // Push values to stack when encountering '['
                countStack.push(count);
                stringStack.push(curr);
                count = 0; // Reset count
                curr = ""; // Reset curr string
            } 
            else if (c == ']') { // When encountering ']', process the last stored string
                StringBuilder decodeString = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop(); // Get the repeat count

                for (int j = 0; j < repeat; j++) { 
                    decodeString.append(curr);
                }
                curr = decodeString.toString(); // Convert StringBuilder to String
            } 
            else { 
                curr += c; // Append normal characters to curr
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(decode("3[b2[v]]")); // Expected Output: "bvvbvvbvv"
        System.out.println(decode("2[cv]"));    // Expected Output: "cvcv"
    }
}
