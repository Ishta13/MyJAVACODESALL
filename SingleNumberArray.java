public class SingleNumberArray {
    public static void single(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isUnique = true; // Assume current element is unique
            for (int j = 0; j < n; j++) {  // check all other elements
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false; // found a duplicate
                     break;
                }
            }
            if (isUnique) {
                System.out.println("Single (non-repeating) number: " + arr[i]);
                break; // only first unique number
            }
        }
    }

    public static void main(String[] args) {
        int p[] = {1, 2, 2, 4, 3, 1, 4};
        single(p, p.length);
    }
}
