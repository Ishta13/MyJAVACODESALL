public class rhombuspattern {
    public static void rhombus(int n){
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // printing j instead of stars
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //printing stars
        public static void rhom(int m)
        {
            for(int i=1;i<=m;i++){
                for(int j=1;j<=m-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=m;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
    
            }


        }
    
    public static void main(String[] args) {
        rhombus(6);
        System.out.println();
        rhom(6);
    }
    
}
