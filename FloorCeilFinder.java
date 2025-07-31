import java.util.*;

public class FloorCeilFinder {

    // 🔹 Function to find the floor of x in the array
    // ▫️ ele find
    static int findFloor(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1; // default value agar floor exist na kare

        while (low <= high) {
            int mid = (low + high) / 2;

            // ✅ Agar mid element x se chhota ya equal hai
            if (arr[mid] <= x) {
                ans = arr[mid];        // yeh ek valid floor ho sakta hai
                low = mid + 1;         // right side check karo better floor ke liye
            } else {
                high = mid - 1;        // chhote elements left side mein honge
            }
        }

        return ans; // agar floor mila toh return hoga, warna -1
    }
    /*  🧊🧊🧊 jaha index nikalana ho vaha ans=mid 
                jaha ele chahiye ho vaha ans= arr[mid] 🧊🧊   */

    // 🔹 Function to find the ceiling of x in the array
    static int findCeil(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1; // default value agar ceil exist na kare

        while (low <= high) {
            int mid = (low + high) / 2;

            // ✅ Agar mid element x se bada ya equal hai
            if (arr[mid] >= x) {
                ans = arr[mid];       // yeh ek valid ceil ho sakta hai
                high = mid - 1;       // left side check karo better ceil ke liye
            } else {
                low = mid + 1;        // bade elements right side mein honge
            }
        }

        return ans; // agar ceil mila toh return hoga, warna -1
    }
    /*  🧊🧊🧊 jaha index nikalana ho vaha ans=mid 
                jaha ele chahiye ho vaha ans= arr[mid] 🧊🧊   */

    // 🔹 Combined function to return both floor and ceiling
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int floor = findFloor(arr, n, x);
        int ceil = findCeil(arr, n, x);
        return new int[] { floor, ceil }; // result as array
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };  // sorted array
        int x = 5;                         // element jiska floor & ceil chahiye
        int n = arr.length;

        int[] result = getFloorAndCeil(arr, n, x);
        System.out.println("Floor of " + x + " is: " + result[0]);
        System.out.println("Ceiling of " + x + " is: " + result[1]);
    }
}
