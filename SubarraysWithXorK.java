import java.util.*;

public class SubarraysWithXorK {

    public static int SubarraysWithXor(int[] a, int k) {
        int n = a.length; // 🔹 Array ka size
        int xr = 0;       // 🔹 Running XOR (prefix XOR)
        
        // 🔹 Map banaya: prefixXOR → uski frequency

         /* System.out.println(4 ^ 2);  // 6
            System.out.println(2 ^ 6);  // 4
             System.out.println(6 ^ 4);  // 2

         */
        /*  0101  = 5
          ^ 0011  = 3
           -------
            0110  = 6
        */
        Map<Integer, Integer> mpp = new HashMap<>();

        mpp.put(xr, 1); // 🔹 0 XOR initially 1 baar mila hai
        int cnt = 0;    // 🔹 Final count of subarrays

        // 🔁 Traverse karo array
        for (int i = 0; i < n; i++) {

            // 🔸 Current prefix XOR calculate karo
            xr = xr ^ a[i];

            // 🔸 Formula: xr = prefixXOR, toh agar (xr ^ k) pehle mila ho
            // matlab uske baad se ab tak ka XOR = k
            int x = xr ^ k;

            // ✅ Agar x map me hai → toh kitni baar mila hai, utni subarrays banti hain
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x); // 🔹 Add frequency to count
            }

            // 🔸 Current prefix XOR ki frequency map me daalo
            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }

        return cnt; // 🔚 Final answer
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4}; // 🔹 Sample array
        int k = 6;                 // 🔹 Target XOR
        int ans = subarraysWithXorK(a, k); // 🔸 Function call
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
