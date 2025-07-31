import java.util.*;

public class BinaryNumbers {
    public static void generateBinaryNumbers(int N) {
        // Ek queue banayi jisme binary numbers string ke form me store honge
        Queue<String> queue = new LinkedList<>();

        // Sabse pehla binary number "1" hota hai
        queue.add("1");

        // N baar loop chalega taaki N binary numbers print ho sake
        for (int i = 0; i < N; i++) {
            // Queue ka front element nikaala
            String current = queue.remove();

            // Current binary number print kiya
            System.out.print(current + " ");

            // Queue me next 2 binary numbers add kiye (current + "0" and current + "1")
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
    public static void main(String[] args) {
        int N = 5; // Aap chahe to is value ko badal sakte ho input ke liye
        generateBinaryNumbers(N); // Binary numbers generate karne wali function ko call kiya
    }
}
