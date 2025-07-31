import java.util.*;

public class Three_Sum{

    // Function to return all unique triplets whose sum = 0
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Pehle array ko sort kar lo taaki two-pointer logic apply ho sake
        Arrays.sort(arr);

        // Step 2: Outer loop se har element fix karenge as the first element of triplet
        for (int i = 0; i < n; i++) {

            // Step 2.1: Agar current element same hai previous se, toh skip karo (duplicate avoid karne ke liye)
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Step 3: Two-pointer technique use karenge to find remaining 2 elements
            int j = i + 1;         // left pointer
            int k = n - 1;         // right pointer

            // Step 4: Jab tak left pointer chhota hai right pointer se, loop chalayenge
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k]; // current triplet ka sum

                if (sum < 0) {
                    // Agar sum chhota hai 0 se, toh left pointer aage badhao
                    j++;
                } else if (sum > 0) {
                    // Agar sum bada hai 0 se, toh right pointer peeche le jao
                    k--;
                } else {
                    // ✅ Jab sum exactly 0 ho, toh valid triplet mil gaya
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp); // result list mein add kar do

                    j++;
                    k--;

                    // Step 5: Duplicate elements ko skip karo (left side)
                    while (j < k && arr[j] == arr[j - 1]) j++;

                    // Step 6: Duplicate elements ko skip karo (right side)
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        // Step 7: Final list of triplets return karo
        return ans;
    }

    public static void main(String[] args) {
        // Sample input array
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;

        // Triplets find karo jinka sum 0 hai
        List<List<Integer>> ans = triplet(n, arr);

        // Output format mein print karo
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
