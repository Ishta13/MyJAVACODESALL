import java.util.*;

public class Four_Sum {

    // Function to return all unique quadruplets whose sum = target
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // array ka size
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array to apply two-pointer and handle duplicates
        Arrays.sort(nums);

        // Step 2: Outer loop to fix the first element
        for (int i = 0; i < n; i++) {
            // Skip duplicate 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Step 3: Second loop to fix the second element
            for (int j = i + 1; j < n; j++) {
                // Skip duplicate 'j'
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
            //nums[j] == nums[j - 1] = duplicate elements
                // Step 4: Two-pointer approach for remaining two numbers
                int k = j + 1;
                int l = n - 1;

                // Step 5: Check all combinations using two pointers
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l]; // total sum

                    if (sum == target) {
                        // ✅ Valid quadruplet found
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);

                        // Move both pointers inward
                        k++;
                        l--;

                        // Skip duplicate for k
                        while (k < l && nums[k] == nums[k - 1]) k++;

                        // Skip duplicate for l
                        while (k < l && nums[l] == nums[l + 1]) l--;

                    } else if (sum < target) {
                        // Agar sum chhota hai → left pointer aage badhao
                        k++;
                    } else {
                        // Agar sum bada hai → right pointer peeche lao
                        l--;
                    }
                }
            }
        }

        // Final answer list return karo
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        List<List<Integer>> ans = fourSum(nums, target);

        System.out.println("The quadruplets are: ");
        for (List<Integer> quad : ans) {
            System.out.print("[");
            for (int num : quad) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
