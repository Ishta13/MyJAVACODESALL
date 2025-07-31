public class BinarySearchFindXAnd_search_Insert {

    // Binary Search function
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        // Jab tak search space valid hai
        while (low <= high) {
            int mid = low + (high - low) / 2; // Overflow safe mid

            if (arr[mid] == x) {
                return mid; // Element mil gaya
            } else if (arr[mid] < x) {
                low = mid + 1; // Right half me search karo
            } else {
                high = mid - 1; // Left half me search karo
            }
        }

        return -1; // X nahi mila
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 14, 18, 25}; // Sorted array
        int x = 14; // Element to search

        int result = binarySearch(arr, x);

        if (result != -1) {
            System.out.println("Element " + x + " found at index " + result);
        } else {
            System.out.println("Element " + x + " not found in the array.");
        }
    }
}
