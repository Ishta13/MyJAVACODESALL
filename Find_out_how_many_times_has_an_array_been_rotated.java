public class Find_out_how_many_times_has_an_array_been_rotated {
      //O(log N) time complexity
      //🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢jis index pr minimum ele index ke equal times arrays rotate🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢🍢
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
                low = mid + 1; ///mid+1 kyuki mid ko skip karna hai kyunki mid right part me already caalculate ho gya
            }
        }

        return low;  // ya arr[high], both same now
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        System.out.println("Minimum is: " + findMin(arr));  // Output: 1
    }
}
