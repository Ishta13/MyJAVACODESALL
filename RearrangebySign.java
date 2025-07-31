import java.util.ArrayList;
import java.util.Arrays;

public class RearrangebySign {

    public static int[] rearrange(int arr[], int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Step 1: Store positive and negative elements in separate lists
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        // Step 2: Fill result alternately from pos and neg
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) { //add pos and neg half half length pr
            result[2 * i] = pos.get(i);     // even index gets positive
            result[2 * i + 1] = neg.get(i); // odd index gets negative
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {11, 2, -5, -3}; // even length with equal positives and negatives
        int[] res = rearrange(arr, arr.length);
        System.out.println(Arrays.toString(res)); // Proper array printing
    }
}
