public class transposeof2Dmatrix {
    public static void transpose(int matrix[][])
    {
        int i= matrix.length , j= matrix[0].length;      // start with 1st row and 1st column
        int transposation[][] = new int[i][j];           //very imp iskee bina tranpose nhi hoga becaause jaise [rows][cols] define hota vese hi further proceed taaki transposation me start me hi [j][i] exchangable ho jaaye
        for ( i=0;i<matrix.length;i++){
            for( j=0;j<matrix[i].length;j++){
                transposation[i][j] = matrix[j][i];
            }
        }
        System.out.println("after transposing");
        for (i=0;i<transposation.length;i++){
            for(j=0;j<transposation[i].length;j++){
                System.out.print(transposation[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("before transposing");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        transpose(mat);
       

        
    }
    
}
