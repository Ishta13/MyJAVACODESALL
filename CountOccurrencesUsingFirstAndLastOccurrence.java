// CountOccurrences.java
// Problem Statement:
// You are given a sorted array containing N integers and a number X,
// you have to find how many times X occurs in the given array.

public class CountOccurrencesUsingFirstAndLastOccurrence {

    // Function to find the first occurrence of X
    public static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;        // Possible answer mil gaya
                high = mid - 1;   // Left mein check karo (first occurrence chahiye)
            } else if (arr[mid] < x) {
                low = mid + 1;    // Right mein jao
            } else {
                high = mid - 1;   // Left mein jao
            }
        }

        return ans;
    }

    // Function to find the last occurrence of X
    public static int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;       // Possible answer mil gaya
                low = mid + 1;   // Right mein check karo (last occurrence chahiye)
            } else if (arr[mid] < x) {
                low = mid + 1;   // Right mein jao
            } else {
                high = mid - 1;  // Left mein jao
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        int x = 4;

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        if (first == -1 || last == -1) {
            System.out.println("Element " + x + " not found in the array.");
        } else {
            int count = last - first + 1;
            System.out.println("Element " + x + " occurs " + count + " time(s) in the array.");
        }
    }
}
