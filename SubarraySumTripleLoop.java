public class SubarraySumTripleLoop {
    public static int countSubarrays(int[] arr, int targetSum) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {              // Start index
            for (int j = i; j < n; j++) {   //if take j=i+1 then wrong answer       // End index
                int sum = 0;
                for (int k = i; k <= j; k++) {     // Sum from i to j
                    sum += arr[k];
                }
                if (sum == targetSum) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int targetSum = 5;
        System.out.println("Count = " + countSubarrays(arr, targetSum));  // Output: 3
    }
}
