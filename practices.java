public class practices {
    public static void main(String[] args) {
        boolean now=false;
        int key=1;
        int mat[][] = {{1},{3}};
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==key)
                {
                    System.out.println("found at"+i+","+j);
                }
            }
        }
       
      

    }
}
