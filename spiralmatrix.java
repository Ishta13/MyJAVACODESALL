public class spiralmatrix {
    public static void spiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        /////////////////////////////////////////top///////////////////////////////
        while (startRow<=endRow && startCol<=endCol){         // nhi likha toh yaa toh half ele print ya double

        for(int j=startCol;j<=endCol;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        ///////////////////////////right//////////////////////
        for (int i=startRow+1;i<=endRow;i++){
            System.out.print(matrix[i][endCol]+" ");
        }
        ////////////////////////bottom///////////////////////
        for(int j=endCol-1;j>=startCol;j--){
            if (startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }

        //////////////////////////////left/////////////////////////////////

        for(int i=endRow-1;i>=startRow+1;i--){
            if (startCol==endCol){
                break;                   // kyuki void toh return use nhi vrna return bhi use kr sktyy 
            }
            System.out.print(matrix[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
    }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        spiral(arr);               

                                  

        
    }
    
}
