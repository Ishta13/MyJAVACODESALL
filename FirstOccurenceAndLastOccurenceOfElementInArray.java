public class FirstOccurenceAndLastOccurenceOfElementInArray {
    // Method to find the first occurrence
    public static int fo(int arr[], int key, int i) {
        if (i > arr.length - 1) { // base case
            return -1; // Not found
        }
        if (arr[i] == key) {
            return i; // Found first occurrence
        }
        return fo(arr, key, i + 1); // Recursive call
    }

    // Method to find the last occurrence
    public static int lo(int arr[], int key, int i) {
        if (i > arr.length - 1) { // base case
            return -1; // Not found
        }

        // First go forward in the array
        int isFound = lo(arr, key, i + 1); //jaise binary search linear search me 
        if (isFound != -1) {
            return isFound; // Return if found
        }

        // Then check the current index
        if (arr[i] == key) {
            return i; // Return the last occurrence
        }

        return -1; // Not found   taaki error naa aaye return statement not found
    }

    public static void main(String[] args) {
        int array[] = {12, 13, 14, 15, 13};
        int key = 13;
        System.out.println("First occurrence found at: " + fo(array, key, 0));

        int ar[] = {12, 13, 14, 15, 16, 13, 13};
        int keys = 13;
        System.out.println("Last occurrence found at: " + lo(ar, keys, 0));
    }
}
