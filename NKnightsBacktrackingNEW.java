public class NKnightsBacktrackingNEW {
    public static boolean isSafe(char board[][], int row, int col) {
        int[][] moves = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        
        for (int i = 0; i < moves.length; i++) {
            int newRow = row + moves[i][0];
            int newCol = col + moves[i][1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board.length && board[newRow][newCol] == 'K') {
                return false;
            }
        }
        return true;
    }
    
    public static void placeKnights(char board[][], int row, int col, int placedKnights, int n) {
        if (placedKnights == n) {
            printBoard(board);
            return;
        }
        
        if (row >= n) {
            return;
        }
        
        for (int j = col; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'K';
                
                int nextRow = row;
                int nextCol = j + 1;
                if (nextCol == n) {
                    nextRow++;
                    nextCol = 0;
                }
                
                placeKnights(board, nextRow, nextCol, placedKnights + 1, n);
                board[row][j] = 'X';
            }
        }
        
        placeKnights(board, row + 1, 0, placedKnights, n);
    }
    
    public static void printBoard(char board[][]) {
        System.out.println("\nSolution");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        
        placeKnights(board, 0, 0, 0, n);
    }
}
