import java.util.*;

public class MergetwoSortedArraysWithoutExtraSpace{

   public static void merge(long[] arr1, long[] arr2, int n, int m) {
     // n is size of arr1
     // m is size of arr2
    // Step 1: 2 pointers
    int left = n - 1;     // arr1 ka last index
    int right = 0;        // arr2 ka first index

    // Step 2: Jab tak dono pointers valid hain
    while (left >= 0 && right < m) {

        // Agar arr1 ka element bada hai arr2 ke element se => to swap
        if (arr1[left] > arr2[right]) {
            long temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
            left--;     // peeche jao arr1 me
            right++;    // aage badho arr2 me
        } else {
            break; // sorted order aa gaya, swap ki zarurat nahi
        }
    }

    // Step 3: Individually dono arrays sort kar do
    Arrays.sort(arr1); // sort arr1
    Arrays.sort(arr2); // sort arr2
}


    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

}