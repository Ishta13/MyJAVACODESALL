public class BacktrackRatRace {
    public static int rat(int arr[][], int i, int j, int n, int m, boolean visited[][]) {
        // If the rat reaches the bottom-right corner, it's a valid path
        if (i == n - 1 && j == m - 1) {
            return 1; // 1 possible solution
        }
        // If the rat goes out of bounds or revisits a cell, it's not a valid path
        if (i >= n || j >= m || i < 0 || j < 0 || visited[i][j]) {
            return 0; // 0 possible solution
        }

        // Mark the cell as visited
        visited[i][j] = true;

        // Move to the right
        int rightMove = rat(arr, i, j + 1, n, m, visited);
        // Move down
        int downMove = rat(arr, i + 1, j, n, m, visited);
        // Move to the left
        int leftMove = rat(arr, i, j - 1, n, m, visited);    //visited isiliye le rhe yuki uske bina rat loop me ghumta jaa rha
        // Move to the up
        int upMove = rat(arr, i - 1, j, n, m, visited);

        // Unmark the cell (backtrack)
        visited[i][j] = false;

        // Sum all possible paths
        return rightMove + downMove + leftMove + upMove;
    }

    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        boolean visited[][] = new boolean[4][4];
        System.out.println("Total possible ways: " + rat(arr, 0, 0, 4, 4, visited));
    }
}
