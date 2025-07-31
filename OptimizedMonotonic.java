import java.util.ArrayList;

public class OptimizedMonotonic {
    public static boolean isIncreasingMonotone(ArrayList<Integer> nums) {
        // Check if the list is monotonically increasing
        for (int i = 1; i < nums.size(); i++) { // i=1 se isiliye start kra kyuki if compare i=0 aur i=-1 se kra hai
            //value i=1 se hi shi aaygi 
            if (nums.get(i) < nums.get(i - 1)) {
                return false; // Found a decrease
            }
        }
        return true; // No decrease found, it's increasing
    }

    public static boolean isDecreasingMonotone(ArrayList<Integer> nums) {
        // Check if the list is monotonically decreasing
        for (int i = 1; i <nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                return false; // Found an increase
            }
        }
        return true; // No increase found, it's decreasing
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        // Check if the array is monotonically increasing or decreasing
        System.out.println("Is the list monotonically increasing? " + isIncreasingMonotone(arr));
        System.out.println("Is the list monotonically decreasing? " + isDecreasingMonotone(arr));
    }
}

