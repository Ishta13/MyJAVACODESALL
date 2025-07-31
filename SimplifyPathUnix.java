                                                                                                                                                                                                                                                                    import java.util.Stack;

public class SimplifyPathUnix {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>(); // Stack to store directory names
        String[] arr = path.split("/"); // Split path based on '/'

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("..") && !s.isEmpty()) { 
                s.pop(); // Pop when ".." is encountered
            } else if (!arr[i].equals("") && !arr[i].equals(".") && !arr[i].equals("..")) {
                s.push(arr[i]); // Push valid directory names
            }
        }

        StringBuilder sb = new StringBuilder();
        
        // Using a normal for loop instead of a for-each loop
        Object[] stackArray = s.toArray();   ///////////changing stack to array
        for (int i = 0; i < stackArray.length; i++) {
            sb.append("/");
            sb.append(stackArray[i]);
        }

        return sb.length() == 0 ? "/" : sb.toString(); // Return root if empty
    }

    public static void main(String[] args) {
        SimplifyPathUnix obj = new SimplifyPathUnix();
        System.out.println(obj.simplifyPath("/home//foo/")); // Output: /home/foo
        System.out.println(obj.simplifyPath("/../")); // Output: /
        System.out.println(obj.simplifyPath("/home/../usr/bin/./")); // Output: /usr/bin
    }
}
