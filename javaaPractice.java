import java.util.*;

public class javaaPractice {

    // Function to search for key in array
    public static int arr(int a[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i; // returning index of key
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Implicit and Explicit Type Conversion
        int o = 6;
        float p = o;
        System.out.println("The value of p is: " + p); // implicit conversion

        float f = 9.5F;
        int k = (int) f;
        System.out.println("The value of f is: " + f);
        System.out.println("The value of k is: " + k); // explicit conversion

        // Array Input and Display
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int an[] = new int[n];
        System.out.println("Enter elements");
        for (int l = 0; l < n; l++) {
            an[l] = sc.nextInt();
        }

        System.out.println("Elements in the array are:");
        for (int l = 0; l < n; l++) {
            System.out.print(an[l] + " ");
        }
        System.out.println();

        // Linear Search
        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 3;
        int tr = arr(arr, 5, key);
        System.out.println("Key found at index: " + tr);

        // Transpose of 3x3 Matrix
        int w = 3;
        int m = 3;
        int ar[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int temp[][] = new int[m][w];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = ar[j][i];
            }
        }

        System.out.println("Transpose of the matrix is:");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

        // Simple Calculator
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Cannot divide by 0");
                break;
            default:
                System.out.println("Invalid operator");
        }

        // Matrix Multiplication 2x2
        int[][] d = {
            { 1, 2 },
            { 3, 4 }
        };

        int[][] g = {
            { 5, 6 },
            { 7, 8 }
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int t = 0; t < 2; t++) {
                    result[i][j] += d[i][t] * g[t][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        int rows = 4;
        int[][] pattern = new int[rows][]; // jagged array
        int num = 0;

        // Initialize rows with increasing sizes
        for (int i = 0; i < rows; i++) {
            pattern[i] = new int[i + 1]; // row size increases
            for (int j = 0; j <= i; j++) {
                pattern[i][j] = num;
                num++;
            }
        }

        // Print the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println(); // move to next line
        }

    
    }
}
