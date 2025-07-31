public class SingleNumberArrayOptimized {
    public static void single(int arr[], int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= arr[i];  // XOR the result with each element
        }
        System.out.println("Single (non-repeating) number: " + result);
    }

    public static void main(String[] args) {
        int p[] = {1, 2, 2, 4, 3, 1, 4};
        single(p, p.length);
    }
}
