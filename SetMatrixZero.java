public class SetMatrixZero {

    // Optimized function to set matrix rows and columns to 0 in-place
    public static void setZeroes(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
//(2,2) = 9
/*Is matrix[2][0] == 0? ❌ No

Is matrix[0][2] == 0? ❌ No
✅ Nothing changes

(2,1) = 8

Is matrix[2][0] == 0? ❌ No

Is matrix[0][1] == 0? ✅ YES
➡ Set matrix[2][1] = 0

(1,2) = 6

Is matrix[1][0] == 0? ✅ YES
➡ Set matrix[1][2] = 0

(1,1) = 0
Already zero

✅ Matrix after Second Pass:
csharp
Copy code
[
  [1, 0, 3],
  [0, 0, 0],
  [7, 0, 9]
] */

        // Step 1: Check if the first row has any zero
        for (int j = 0; j < colCount; j++) { // Loop through the first row
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Step 2: Check if the first column has any zero
        for (int i = 0; i < rowCount; i++) { // Loop through the first column
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // Step 3: Use first row and column to mark zero rows and cols
        for (int i = 1; i < rowCount; i++) {
            for (int j = 1; j < colCount; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark the row
                    matrix[0][j] = 0; // mark the column
                }
            }
        }

        // Step 4: Set the marked rows and columns to zero (excluding first row/col)
        for (int i = 1; i < rowCount; i++) { /////taking i=1 and j=1 to avoid first row and column
            for (int j = 1; j < colCount; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: Set first row to zero if needed
        if (firstRowHasZero) { // Check if first row has zero
            for (int j = 0; j < colCount; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: Set first column to zero if needed
        if (firstColHasZero) { // Check if first column has zero
            for (int i = 0; i < rowCount; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Function to print the matrix clearly
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {           // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {    // Loop through columns
                System.out.print(matrix[i][j] + " ");       // Print each element
            }
            System.out.println();                           // Newline after each row
        }
    }

    // Main method to test the optimized logic
    public static void main(String[] args) {
        // Sample matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);   // Print before applying logic

        setZeroes(matrix);     // Apply optimized zeroing logic

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);   // Print after update
        //O(m*n)
    }
}

    

