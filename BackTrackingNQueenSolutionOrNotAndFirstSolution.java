public class BackTrackingNQueenSolutionOrNotAndFirstSolution {
    public static boolean isSafe(char board[][] , int row, int col)
    {
        //vertical up
        for(int i=row-1;i>=0;i--)
        {
        if(board[i][col]=='Q')
        {
            return false;
        }
        }
         //diagonal left
         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
         if(board[i][j]=='Q')
         {
             return false;
         }
        }
         //dia right
         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
         {
         if(board[i][j]=='Q')
         {
             return false;
         }
        }
        return true;
    }
    public static boolean nqueen(char board[][] , int row)
    {
        if(row==board.length)
        {
            return true;  //agr row board.length tk pohoch gya toh sol exist krta
        }
        // step 1 row me queen appending ho rha(without attacking)
        //coloumn loop kyuki row +1 aage bdha rhe row ko toh no need for row loop
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j] = 'Q';
                if (nqueen(board, row+1))
                {
                return true; //ek sol hone ke baad hi print  
                } 
                board[row][j]='X'; //backtracking                            
            }
        }
        return false;
    }
    public static void printboard(char arr[][])
    {
        System.out.println(">>>>>>>>>>>>>>>>>>>CHESS BOARD <<<<<<<<<<<<<<<<<<<");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char chess[][] = new char[n][n];
        // Initialize the board with 'X'
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 'X';
            }
        }
        if (nqueen(chess, 0))
        {
            System.out.println("1st sol is: ");
            printboard(chess);

        }
        else{
            System.out.println("no solution exists");
        }
    }
}
