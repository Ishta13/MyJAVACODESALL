public class hollowrectangle {
    public static void rectanglepattern(int totlrow, int totlcol)
    {
        for(int i=1;i<=totlrow;i++)
        {
            for(int j=1;j<=totlcol;j++)
            {
                if(i==1||i==totlrow|| j==1||j==totlcol)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rectanglepattern(6,4);
       
    }
    
    
}
