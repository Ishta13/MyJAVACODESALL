// SearchInRotatedArrayWithDuplicates.java
// Problem: Rotated Sorted Array with Duplicates — check if element exists

public class SearchInRotatedArrayWithDuplicates {

    public static boolean search(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return true;  // mil gaya element
            }

            // Jab left, mid, high sab same ho — duplicate values
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;  // doubt clear karo by skipping
            }

            // Left half sorted hai
            else if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k < arr[mid]) {
                    high = mid - 1;  // k left half mein hai
                } else {
                    low = mid + 1;   // k right half mein hoga
                }
            }

            // Right half sorted hai
            else {
                if (arr[mid] < k && k <= arr[high]) {
                    low = mid + 1;   // k right half mein hai
                } else {
                    high = mid - 1;  // k left half mein hoga
                }
            }
        }

        return false;  // nahi mila element
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 0, 0, 1, 2};
        int k1 = 0;
        System.out.println("k = " + k1 + ": " + search(arr1, k1));  // true

        int[] arr2 = {2, 5, 6, 0, 0, 1, 2};
        int k2 = 3;
        System.out.println("k = " + k2 + ": " + search(arr2, k2));  // false
    }
}
