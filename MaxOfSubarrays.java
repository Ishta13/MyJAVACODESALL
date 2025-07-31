import java.util.*;

public class MaxOfSubarrays {

    public static void printMaxOfSubarrays(int[] arr, int n, int k) {
        // Step through each subarray starting at index i
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i]; // Assume the first element is max

            // Step through k elements to find the max
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }

            // Print the max for this subarray
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int n = arr.length;
        int k = 3;

        System.out.println("Maximum of each subarray of size " + k + ":");
        printMaxOfSubarrays(arr, n, k);
    }
}

