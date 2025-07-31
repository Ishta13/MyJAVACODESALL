public class pivotrotatedarray {
    public static int rotatedarray(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                // Check if the key is in the left half
                if (arr[low] <= key && key <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                // Check if the key is in the right half
                if (arr[mid] <= key && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // If the key is not found
    }

    public static void main(String[] args) {
        int pivot[] = {12,13,1,2,3};
        int key = 13;
        int res = rotatedarray(pivot, key);
        if (res != -1) {
            System.out.println(key + " found at " + res);
        } else {
            System.out.println(key + " not found");
        }
    }
}
