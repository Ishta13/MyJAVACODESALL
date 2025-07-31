public class searchinsortedmatrix {
    public static boolean search(int matrix[][],int key){
        // row=i        col=j
        int row=0, col= matrix[0].length-1;
        while (row<matrix.length && col>=0 )
        {
            if (matrix[row][col]==key){
                System.out.println(key+"found at"+"("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println(key+"not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                      {8,23,45,67} ,
                       {5,12,13,15},
                        {204,405,406,408}};
        int key=67;
        System.out.println(search(matrix,key));           
    }
    
}
