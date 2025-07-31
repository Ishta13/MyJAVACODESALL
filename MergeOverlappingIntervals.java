import java.util.*;

public class MergeOverlappingIntervals{

    // Function to merge overlapping intervals
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;

        // Step 1: Sort karo based on starting point of interval
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0]; // ascending order by start
            }
        });
        // Before Sort: [[1,3], [8,10], [2,6], [15,18]]
        // After Sort: [[1,3], [2,6], [8,10], [15,18]]
        // Step 2: Merged intervals store karne ke liye list
        List<List<Integer>> ans = new ArrayList<>();

        // Step 3: Process all intervals
        for (int i = 0; i < n; i++) {
            // Agar ans empty hai ya current interval ka start > last added interval ka end
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                // Non-overlapping hai, add kar do directly
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                // Overlapping hai: Update end of last interval
                int newEnd = Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]);
                ans.get(ans.size() - 1).set(1, newEnd);
            }
            // end of last interval -> ans.get(ans.size() - 1).get(1)
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};

        // Call function
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);

        System.out.println("The merged intervals are:");

        // ✅ Expanded for loop
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> it = ans.get(i); // ith merged interval
            int start = it.get(0);         // get start
            int end = it.get(1);           // get end
            System.out.print("[" + start + ", " + end + "] ");
        }

        System.out.println(); // new line
    }
}
