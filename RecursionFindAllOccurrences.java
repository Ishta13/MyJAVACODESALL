public class RecursionFindAllOccurrences {

    // Helper method to recursively find all indexes of the key
    public static void findIndexes(int[] arr, int i, int key) {
        // Base case: if index reaches the length of the array, return
        if (i >= arr.length) {
            return;
        }
        // If the current element matches the key, print the index
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        
        // Recursive call for the next element
        findIndexes(arr, i + 1, key);
    }

    // Main method to initiate the recursive search and print the result
    public static void main(String[] args) {
        int[] arr = {12, 2, 12, 3, 4, 5, 12};
        int key = 12;
        
        System.out.print("Indexes of key: ");
        findIndexes(arr, 0, key);
    }
}
