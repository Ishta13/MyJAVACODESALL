import java.util.*;

public class SingleNumberFinder {
    /* Time Complexity: O(N)
      🦋🦄🦄🦄🦄  a ^ a = 0 (same number twice ka XOR = 0)
      🦄🦋🦋🦄🦄  a ^ 0 = a
      Space Complexity: O(1) */

    // Function to find the element that appears only once
    public static int findSingleNumber(int[] arr) {
        int xor = 0;

        // arr = {4, 1, 2, 1, 2}
        // Step-by-step XOR of each element
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

            // Dry Run:
            // i = 0 → xor = 0 ^ 4 = 4
            // i = 1 → xor = 4 ^ 1 = 5
            // i = 2 → xor = 5 ^ 2 = 7
            // i = 3 → xor = 7 ^ 1 = 6
            // i = 4 → xor = 6 ^ 2 = 4
        }

        return xor; // Final Answer = 4
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        int single = findSingleNumber(arr);

        System.out.println("Single number in the array is: " + single); // Output: 4
    }
}
