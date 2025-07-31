public class InversionCountMergeSortDivideandConquer {
    public static int merge(int arr[], int si, int ei) {
        int inv_count = 0;
        if (si >= ei) {
            return 0;  // base case
        }
        int mid = si + (ei - si) / 2;
        inv_count += merge(arr, si, mid);  // recursively sort and count left half
        inv_count += merge(arr, mid + 1, ei);  // recursively sort and count right half
        inv_count += inversionCount(arr, si, mid, ei);  // count cross inversions and merge
        return inv_count;
    }

    public static int inversionCount(int arr[], int si, int mid, int ei) {
        int inv_count = 0;
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Merge two halves and count inversions
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inv_count += (mid - i + 1);  // All remaining elements in left subarray are greater than arr[j] 
                // [2, 4, 1, 3, 5]= mid = 2 , 2-0+1=3
            }
        }

        // Copy remaining elements from the left subarray, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted subarray back into the original array
        for (i = si, k = 0;k<temp.length; i++, k++) { //can be used as i<=ei insted of k<temp.length
            arr[i] = temp[k];
        }

        return inv_count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int inv_count = merge(arr, 0, arr.length - 1);
        System.out.println("Total inversion count: " + inv_count);
    }
}
