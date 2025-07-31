public class UpperAndLowerBoundsInSortedArray {
      /* Given a sorted array of N integers and a number x, find:
       🔹 Lower Bound: First index where element is ≥ x
       🔹 Upper Bound: First index where element is > x 😀😃😃😃😃😃😃😃😃😄😄😄😄😄😄*/
        //▫️ index find
      
      
      
      
       /* 🪻🪻🪻left mein (high = mid - 1)🪻🪻🪻
         🪻🪻🪻right mein (low = mid + 1)🪻🪻🪻
       */
    
    
    
    
    
       // Lower Bound: first index where arr[i] >= x
    public static int lowerBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length; // Default: not found, returns size

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;     // Potential answer
                high = mid - 1; // Search in left half
            } else {
                low = mid + 1;  // Go right
            }
        }
        return ans;
    }

    // Upper Bound: first index where arr[i] > x
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    /*  🧊🧊🧊 jaha index nikalana ho vaha ans=mid 
                jaha ele chahiye ho vaha ans= arr[mid] 🧊🧊   */

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4, 5};
        int x = 4;

        int lb = lowerBound(arr, x);
        int ub = upperBound(arr, x);

        System.out.println("Lower Bound of " + x + " is at index: " + lb);
        System.out.println("Upper Bound of " + x + " is at index: " + ub);
    }
}
