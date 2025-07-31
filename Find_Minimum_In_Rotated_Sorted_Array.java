public class Find_Minimum_In_Rotated_Sorted_Array {
      //O(log N) time complexity
    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) { // Jab tak low < high hai //low<=high nhi lena kyuki min galat ho rha
            int mid = low + (high - low) / 2;

            // Right part sorted hai => min left mein bhi ho sakta hai
            if (arr[mid] < arr[high]) {
                high = mid;  // left side search karo
            } 
            else {
                // Left part sorted hai => min right mein hoga
                low = mid + 1;
            }
        }

        return arr[low];  // ya arr[high], both same now
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        System.out.println("Minimum is: " + findMin(arr));  // Output: 1
    }
}
