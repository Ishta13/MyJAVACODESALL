public class PeakElementFinder {
     //✅👙👙👙👙👙👙👙👙 O(log n)👙👙👙👙👙👙👙👙(faster!)
    // Function to find a peak element index
    public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {    
            int mid = low + (high - low) / 2;

            // 🔍 Agar mid ka next element bada hai toh peak right mein hoga
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // Right side pe jao
            } else {
                // 🔍 Nahi toh peak left mein ya mid hi ho sakta hai
                high = mid-1; // mid ko bhi include karte hue left mein jao
            }
        }

        // Jab low == high ho jaata hai, wahi peak element ka index hota hai
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("Index of a peak element: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}
