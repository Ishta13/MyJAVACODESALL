// FirstAndLastOccurrence.java
// This file finds the First and Last Occurrence of a target in a sorted array
/* First Occurrence: high = mid - 1 ← left mein aur dhoondo
                  🧚🏻🧚🏻🧚🏻🧚🏻🧚🏻🧚🏻🧚🏻🧚🏻🧚🏻
Last Occurrence: low = mid + 1 ← right mein aur dhoondo */
public class FirstAndLastOccurrence {

    // Function to find First Occurrence of target
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;          // Possible answer mil gaya
                high = mid - 1;     // Left mein aur check karo (first chahiye)
            } else if (arr[mid] < target) {
                low = mid + 1;      // Right half mein jao
            } else {
                high = mid - 1;     // Left half mein jao
            }
        }

        return ans;
    }
    /*  🧊🧊🧊 jaha index nikalana ho vaha ans=mid 
                jaha ele chahiye ho vaha ans= arr[mid] 🧊🧊   */

    // Function to find Last Occurrence of target
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;          // Possible answer mil gaya
                low = mid + 1;      // Right mein aur check karo (last chahiye)
            } else if (arr[mid] < target) {
                low = mid + 1;      // Right half mein jao
            } else {
                high = mid - 1;     // Left half mein jao
            }
        }

        return ans;
    }
    /*  🧊🧊🧊 jaha index nikalana ho vaha ans=mid 
                jaha ele chahiye ho vaha ans= arr[mid] 🧊🧊   */

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        int target = 4;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        System.out.println("First Occurrence of " + target + " at index: " + first);
        System.out.println("Last Occurrence of " + target + " at index: " + last);
    }   // ▫️▫️▫️▫️▫️index find
}
 