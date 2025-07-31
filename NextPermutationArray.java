import java.util.Arrays;
public class NextPermutationArray {

    // Function to find the next greater permutation
    public static void getNextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the first index from the end where arr[i] < arr[i + 1]
        int indexToSwap = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) { //agrr n-1 liya toh arr[n-1+1] out of bounds
                indexToSwap = i;
                break;
            }
        }
        // If the entire array is non-increasing, it's the last permutation
        if (indexToSwap == -1) { //for ex : {5,4,3,2,1}
            reverse(arr,0, n - 1); // reverse to get the smallest permutation
            return;
        }

        // Step 2: Find the next bigger element to the right and swap
        for (int i = n - 1; i > indexToSwap; i--) {
            if (arr[i] > arr[indexToSwap]) {
                swap(arr, i, indexToSwap);
                break; //taki we only swap once
            }
        }

        // Step 3: Reverse the part of the array after indexToSwap
        reverse(arr, indexToSwap + 1, n - 1);
    }

    // Helper method to reverse a subarray
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements
     static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] input = {2, 1, 5, 4, 3, 0, 0};

        getNextPermutation(input);

        System.out.print("The next permutation is: ");
        System.out.println(Arrays.toString(input));
        
    }
}
