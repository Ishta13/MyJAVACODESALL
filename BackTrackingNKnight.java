import java.util.*;
public class BackTrackingNKnight {
    public static void displayboard(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    public static void printknighttour(int chess[][] , int r, int c, int move)
    {
        //r and c = 0 to chess.length-1
        if (r<0 || c<0 || r>=chess.length || c>=chess.length)  //don't use () for i and j matrix
        {
            return;
        }
        else if(move == chess.length * chess.length) // if reached last row and column of chess board that is 5^2= 25
        { //he move variable tracks how many squares the knight has already visited.
           // chess.length * chess.length represents the total number of cells on the board (for an N × N board, it is N²).
            //If move reaches N², it means the knight has successfully visited every square on the board exactly once.
          //  This means we have found a valid solution.
            
            chess[r][c] = move; //make the move
            displayboard(chess); //dislpay the chess board
            chess[r][c] = 0;  //backtrack mtlb waapis zero se start kro
            return;
        } 
         // now do the moves from 1st
         chess[r][c] = move;  //makemove
         printknighttour(chess, r+2, c-1, move+1);  //all possible L shape moves of knight
         printknighttour(chess, r+2, c+1, move+1);
         printknighttour(chess, r-2, c+1, move+1);
         printknighttour(chess, r-2, c-1, move+1);
         printknighttour(chess, r+1, c+2, move+1);
         printknighttour(chess, r-1, c+2, move+1);
         printknighttour(chess, r+1, c-2, move+1);
         printknighttour(chess, r-1, c-2, move+1);
         chess[r][c] = 0;  //backtrack

    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of cells of chessboard");
        int n = sc.nextInt();
        System.out.println("enter no of rows of chessboard");
        int r = sc.nextInt();
        System.out.println("enter no of coloumns of chessboard");
        int c = sc.nextInt();
        int chess[][] = new int[n][n];
        printknighttour(chess, r, c, 1);

    }
}
