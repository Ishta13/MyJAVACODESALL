public class ReversePairs {
    /* A reverse pair is a pair (i, j) such that:

           i < j

           arr[i] > 2 * arr[j]

            */

    // Main merge sort driver that returns reverse pair count
    public static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;

        int mid = low + (high - low) / 2;
        int count = mergeSort(arr, low, mid);      // left half
        count += mergeSort(arr, mid + 1, high);    // right half
        count += countPairs(arr, low, mid, high);  // count reverse pairs across halves
        merge(arr, low, mid, high);                // merge the sorted halves

        return count;
    }

    // ✅ Count reverse pairs where arr[i] > 2*arr[j]
    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;

        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }

        return count;
    }

    // ✅ Merge step of merge sort
    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int temp[] = new int[high - low + 1];
        int idx = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[idx++] = arr[left++];
        }

        while (right <= high) {
            temp[idx++] = arr[right++];
        }

        // Copy back to original array
         // Copy the sorted subarray back into the original array
         for (int i = low, k = 0; k < temp.length; i++, k++) {
                arr[i] = temp[k];
          }

    }

    // ✅ Main method
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 3, 1}; // Expected reverse pairs = 2 → (3,1) and (3,1)
        int result = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Reverse Pair Count: " + result);
    }
}
