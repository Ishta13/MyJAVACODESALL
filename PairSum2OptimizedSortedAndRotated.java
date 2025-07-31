import java.util.ArrayList;

public class PairSum2OptimizedSortedAndRotated {
    public static boolean pairsum(ArrayList<Integer> sum, int target) {
        int n = sum.size();
        int breakpoint = -1;

        // Find the breakpoint where the array is rotated
        for (int i = 0; i < n - 1; i++) {
            if (sum.get(i) > sum.get(i + 1)) {
                breakpoint = i;
                break;
            }
        }

        int lp = (breakpoint +1) % n;  // Left pointer
        int rp = breakpoint;  // Right pointer

        while (lp != rp) {
            int currentSum = sum.get(lp) + sum.get(rp);

            // Check if the current sum matches the target
            if (currentSum == target) {
                return true;
            }

            // If current sum is less than the target, move the left pointer to the right
            if (currentSum < target) {
                lp = (lp + 1) % n;
            } else {
                // If current sum is greater than the target, move the right pointer to the left
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target = 16;
        System.out.println("Return true or false if target is found for pair sum: " + pairsum(arr, target));
    }
}
