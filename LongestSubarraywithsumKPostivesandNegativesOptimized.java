import java.util.*;
public class LongestSubarraywithsumKPostivesandNegativesOptimized {
    public static int getLongestSubarray(int []a, int k) {
        int n = a.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>(); //to store prefix sums and their first occurrence index.
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem); //map.get is used  to fetch the value associated with the given key.
                maxLen = Math.max(maxLen, len);  
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        } //Map = { -1 : 0,  0 : 1,  1 : 2 }
        //If we reach here, it means we have traversed the entire array.

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

