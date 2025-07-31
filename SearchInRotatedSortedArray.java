// SearchInRotatedSortedArray.java
// Problem: Find target in rotated sorted array with distinct elements

public class SearchInRotatedSortedArray {

    public static int search(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid; // Target mil gaya
            }

            // LEFT HALF is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k < arr[mid]) {
                    high = mid - 1; // k left half mein hai
                } else {
                    low = mid + 1;  // k right half mein hoga
                }
            }
            // RIGHT HALF is sorted
            else {
                if (arr[mid] < k && k <= arr[high]) {
                    low = mid + 1;  // k right half mein hai
                } else {
                    high = mid - 1; // k left half mein hoga
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 0, 1, 2, 3};
        int k = 0;

        int index = search(arr, k);

        if (index != -1) {
            System.out.println("Element " + k + " found at index: " + index);
        } else {
            System.out.println("Element " + k + " not found in the array.");
        }
    }
}
