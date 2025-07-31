import java.util.*;

public class MaxProductSubarray {

    /* 🤯 Twist Kya Hai?
        Negative × Negative = Positive (this can flip the result)
        Zero breaks product, so reset karna padta hai
        That’s why we go from left-to-right and right-to-left */
        /* One-pass O(n), constant space, full safe baba-approved code 😎 */
    // Function to find the maximum product subarray
    public static int maxProductSubArray(int[] arr) {
        int n = arr.length; // Array ka size

        int pre = 1;        // prefix product (left se)
        int suff = 1;       // suffix product (right se)
        int ans = Integer.MIN_VALUE; // sabse chota value start me

        // Traverse array from both directions
        for (int i = 0; i < n; i++) {
            // Agar product 0 ho gaya to wapas 1 se start karo
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;

            // Left se multiply karte jao
            pre *= arr[i];

            // Right se bhi multiply karo
            suff *= arr[n - 1 - i];

            // Max product update karo
            ans = Math.max(ans, Math.max(pre, suff));
        }

        return ans; // Final max product
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};

        // Function call
        int answer = maxProductSubArray(arr);

        // Output
        System.out.println("The maximum product subarray is: " + answer);
    }
}
