public class BacktrackGridWays {
    public static int grid(int i,int j,int n,int m)
    {
        if(i==n-1 || j==m-1) //base case
        {
            return 1;   //only one way
        }
        if(i==n|| j==m)  //can use
        {
            return 0;   //exceeding the grid
        }
        //w1 = (i+1,j) //row increase
        int w1 = grid(i+1, j, n, m);
        //w2 = (i,j+1) //column increase
        int w2 = grid(i, j+1, n, m);
        return w1+w2; //total ways 
    } 
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println("no of ways to solve "+ n + " X "+ m + " grid is: "+ grid(0, 0, n, m));
    }
}
