import java.util.*;

class RotateNinetyOptimized {

    // Function to rotate matrix 90 degrees clockwise
    static void rotate(int[][] matrix) {

        // 🔹 Step 1: Transpose the matrix
        // Example: original matrix
        // 1 2 3
        // 4 5 6
        // 7 8 9
        //
        // Transpose ke baad:
        // 1 4 7
        // 2 5 8
        // 3 6 9

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                // Diagonal ke across swap kar rahe hain: matrix[i][j] <-> matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 🔹 Step 2: Reverse every row
        // Example: abhi matrix hai (after transpose):
        // 1 4 7
        // 2 5 8
        // 3 6 9
        //
        // Har row ko reverse karte hi:
        // 7 4 1
        // 8 5 2
        // 9 6 3 → Final rotated matrix

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                // 2 pointer technique se left aur right elements swap karenge
                // matrix[i][j] = left element
                // matrix[i][matrix.length - 1 - j] = right element

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] =  {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(arr); // function call to rotate the matrix

        System.out.println("🔄 Rotated Matrix (90° Clockwise):");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
