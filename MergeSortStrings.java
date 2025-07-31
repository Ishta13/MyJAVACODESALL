import java.util.Arrays;

public class MergeSortStrings {
    public static void mergeString(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeString(arr, si, mid-1);
        mergeString(arr, mid + 1, ei);

        partways(arr, si, ei, mid);
    }

    public static void partways(String[] arr, int si, int ei, int mid) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {    //jbtk index i chota mid se aur j chota ei index se
            if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to the original array
        for ( k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];   //imp step to copy string
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "mango", "elephant", "banana"};
        mergeString(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));   //imp converting array to string
    }
}
