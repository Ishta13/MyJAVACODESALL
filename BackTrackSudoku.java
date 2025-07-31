public class BackTrackSudoku {
    public static boolean isSafe(int arr[][], int row,int col,int digit)
    {
        //increasing row to check digit
        for(int i=0;i<9;i++)
        {
            if(arr[i][col]==digit)
            {
                return false;
            }
        }
        //increasing column to check digit
        for(int j=0;j<9;j++)
        {
            if(arr[row][j]==digit)
                {
                   return false;
                }
        }
        //checking for grid
        int startingRow = (row/3)*3;
        int startingCol = (col/3)*3;
        for(int i=startingRow;i<startingRow+3;i++) //sr+3 (<0,1,2,3)
        {
            for(int j=startingCol;j<startingCol+3;j++) //checking for grid if digit exists false
            {
                if(arr[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolve(int arr[][],int row, int col)
    {
        if(row>8)
        {
            return true;
        }
        int nextRow= row , nextCol= col+1;
        if(col==8)
        {
            nextRow = row+1;
            nextCol = 0;
        }
        if(arr[row][col]!=0)     //if 0 is there then put digit in sudoku
        {
            return sudokuSolve(arr, nextRow, nextCol); //if not then increment
        }
        for (int digit=1;digit<=9;digit++)
        {
            if(isSafe(arr,row,col,digit))
            {
                arr[row][col]= digit; //implement digit to cell
                if(sudokuSolve(arr, nextRow, nextCol)) //return true after successfully putting digit
                { //hence sol exists
                    return true;
                }
                arr[row][col]=0; //else put 0 on the cell again to restart
            }

        }
        return false;
    }
    public static void printSudoku(int arr[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] =  {{7, 0, 0, 0, 0, 0, 2, 0, 0},   
        {4, 0, 2, 0, 0, 0, 0, 0, 3},   
        {0, 0, 0, 2, 0, 1, 0, 0, 0},   
        {3, 0, 0, 1, 8, 0, 0, 9, 7},   
        {0, 0, 9, 0, 7, 0, 6, 0, 0},   
        {6, 5, 0, 0, 3, 2, 0, 0, 1},   
        {0, 0, 0, 4, 0, 9, 0, 0, 0},   
        {5, 0, 0, 0, 0, 0, 1, 0, 6},   
        {0, 0, 6, 0, 0, 0, 0, 0, 8}   
        };
        System.out.println("possible sol is : "+ sudokuSolve(arr, 0, 0));
        if(sudokuSolve(arr, 0, 0))
        {
            printSudoku(arr);
        }
        else{
            System.out.println("as sol is false so no sol exists");
        }

    }
}
