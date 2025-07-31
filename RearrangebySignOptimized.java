public class RearrangebySignOptimized {

    public static int[] rearrangeBySign(int[] A, int n) {
        int[] result = new int[n];
        int posIndex = 0; // for positive numbers (even indices)
        int negIndex = 1; // for negative numbers (odd indices)

        for (int i = 0; i < n; i++) {
            if (A[i] > 0) {
                result[posIndex] = A[i];
                posIndex += 2;
            } else {
                result[negIndex] = A[i];
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};
        int n = A.length;

        int[] ans = rearrangeBySign(A, n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
