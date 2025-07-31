import java.util.HashMap;

public class LongestSubarraySumZero {

    public static int maxLen(int A[], int n) {
        // 🔸 Map banaya: key = prefix sum, value = us sum ka first index
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int maxi = 0; // 🔸 longest subarray ka length yahan store hoga
        int sum = 0;  // 🔸 prefix sum (0 se lekar current index tak ka total)

        // 🔁 Saare elements ke liye loop chalao
        for (int i = 0; i < n; i++) {
            sum += A[i]; // 🔸 Har baar sum update karte jao

            // ✅ CASE 1: Agar sum 0 ho gaya
            if (sum == 0) {
                maxi = i + 1; // 🔸 0 se i tak subarray ka sum 0 hai
            }

            // ✅ CASE 2: Agar yeh sum pehle se map me hai
            if (mpp.containsKey(sum)) {
                // 🔸 Means sum dobara mila → beech ka sum 0 hai
                int len = i - mpp.get(sum); // 🔸 Subarray length nikaalo
                maxi = Math.max(maxi, len); // 🔸 Maximum length update karo
            } 
            else {
                // ✅ CASE 3: Agar sum pehli baar mila → map me store karo
                mpp.put(sum, i);
            }
        }

        return maxi; // 🔸 Final answer return karo
    }

    public static void main(String[] args) {
        // 🔹 Sample input array
        int[] A = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = A.length;

        // 🔹 Function call + output print
        int maxLength = maxLen(A, n);
        System.out.println("Longest subarray with sum 0 has length: " + maxLength);
    }
}
